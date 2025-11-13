import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class SimpleProxyServer {
    public static void main(String[] args) {
        try {
            int port = 8080;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("Proxy server started on port " + port);

            while (true) {
                Socket clientSocket = serverSocket.accept();
                Thread thread = new Thread(new ProxyThread(clientSocket));
                thread.start();
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

class ProxyThread implements Runnable {
    private Socket clientSocket;

    public ProxyThread(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            BufferedReader clientReader =
                    new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            OutputStream clientOut = clientSocket.getOutputStream();

            String requestLine = clientReader.readLine();
            if (requestLine == null || requestLine.isEmpty()) {
                clientSocket.close();
                return;
            }

            System.out.println("Browser request: " + requestLine);

            // Read and print all headers
            String line;
            while ((line = clientReader.readLine()) != null && !line.isEmpty()) {
                System.out.println("Header: " + line);
            }

            // Connect to Google
            String googleHost = "www.google.com";
            Socket serverSocket = new Socket(googleHost, 80);

            BufferedWriter serverOut =
                    new BufferedWriter(new OutputStreamWriter(serverSocket.getOutputStream()));

            String[] parts = requestLine.split(" ");
            String method = parts[0];
            String path = parts[1];
            String version = parts[2];

            // Forward the HTTP request to Google
            serverOut.write(method + " " + path + " " + version + "\r\n");
            serverOut.write("Host: " + googleHost + "\r\n");
            serverOut.write("Connection: close\r\n\r\n");
            serverOut.flush();

            // Read the response from Google and send back to the client
            InputStream serverIn = serverSocket.getInputStream();
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = serverIn.read(buffer)) != -1) {
                clientOut.write(buffer, 0, bytesRead);
            }

            clientOut.flush();

            serverSocket.close();
            clientSocket.close();

        } catch (Exception e) {
            System.out.println("Error in ProxyThread: " + e);
        }
    }
}
