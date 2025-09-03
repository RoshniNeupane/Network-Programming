import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressType {
    public static void main(String [] args){
        try{
            InetAddress address=InetAddress.getByName("FE80:0000:0000::00000");
           System.out.println(address+" is loopbackaddress? "+address.isLoopbackAddress());
            System.out.println(address+" is any local address: "+address.isAnyLocalAddress());
           System.out.println(address+" is linklocaladdress? "+address.isLinkLocalAddress());
        }catch(UnknownHostException e){
            e.printStackTrace();
        }
    }
}

//Address Types
//Any local address:
// is AnyLocalAddress();- 0.0.0.0 -> Wildcard address
//If device is not assigned with any IP address// If device wants to listen all interface
//localaddress ko value diye matra true aauxa navaye sabaima false
//Loopback address: isLoopbackAddress();- 127.0.0.1
//Loopback Address means the device is communicating with itself
//Example of loopbackaddress is localhost.
//localhost diye matra true navaye false sabaima cause they arent loop back address
//isLinkLocalAddress means the address having sensors . sensors communicate with each other . example of using such local address is gadi haru
// link localaddress example-FE80:0000:0000::00000 , 169.254.0.0- 169.254.255.255 
