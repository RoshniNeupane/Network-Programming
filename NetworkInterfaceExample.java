import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public class NetworkInterfaceExample {
    public static void main(String[]args){
        try {
            Enumeration<NetworkInterface> nis = NetworkInterface.getNetworkInterfaces();

            while(nis.hasMoreElements()) {
                NetworkInterface ni = nis.nextElement();

                if(ni.isLoopback()) {
                    System.out.println(ni);
                }
            }

            NetworkInterface loopback = NetworkInterface.getByName("loopback_0");

            Enumeration<InetAddress> addresses = loopback.getInetAddresses();

            while(addresses.hasMoreElements()) {
                InetAddress address = addresses.nextElement();

                System.out.println(address);
            }
        } catch (SocketException e) {
            System.out.println(e);
        }
    }
}

//learn methods of networkInterface
//getByname- gets a networkinterface object by its name.
//getByIndex- Gets a networkinterface object by its index.
//getNetworkInterfaces- Returns an enumeration of all network interfaces on the machines.
//getInetAddress- Returns an Enumeration of InetAddress objects assigned to the interface.
//getInterfaceAddresses-Returns a list of InterfaceAddress objects,providing more details than getInetAddress(), such as subnet maks and broadcast addresses.


