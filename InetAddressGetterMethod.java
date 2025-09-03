import java.net.InetAddress;
public class InetAddressGetterMethod {
    

    public static void main(String[] args) {
        try {
            InetAddress ip = InetAddress.getByName("www.roshni.com");
            byte[] rawAddress = ip.getAddress();
            System.out.print("Raw IP Address: ");
            for (byte b : rawAddress) {
                System.out.print((b & 0xFF) + ".");
            }
            System.out.println("\nCanonical Host Name: " + ip.getCanonicalHostName());
            System.out.println("\nHost Name: " + ip.getHostName());
            System.out.println("IP Address: " + ip.getHostAddress());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}


//Getter method of InetAddress 

//gethostname() - returns the host name of the IP address
//getCanonicalHostName() - returns the canonical host name
//getAddress() - returns the raw IP address
//getHostAddress() - returns the string representation of the IP address
//What is canonical?? - The canonical host name is the unique, fully qualified domain name (FQDN) for a host, which is used to identify it on the internet.


