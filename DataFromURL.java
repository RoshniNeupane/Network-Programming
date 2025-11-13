import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class DataFromURL {
    public static void main(String[]args){
        try{
            URL url=new URL("https://google.com");
            URLConnection connection=url.openConnection();
            connection.connect();
            InputStream in=connection.getInputStream();
            InputStreamReader isr=new InputStreamReader(in);
            BufferedReader bfr=new BufferedReader(isr);
            String line;
            while((line=bfr.readLine())!=null){
            System.out.println(line);     
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
