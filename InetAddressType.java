import java.net.InetAddress;
import java.net.UnknownHostException;
public class InetAddressType {
    public static void main(String [] args){
        try{
            InetAddress address=InetAddress.getByName("172.16.0.0");
            System.out.println(address+" isMulticastAddress? "+address.isMulticastAddress());
            // System.out.println(address+" isMulticastGlobal? "+address.isMulticastGlobal());
            // System.out.println(address+" isMulticastOrganizationLocal? "+address.isMulticastOrganizationLocal());
            // System.out.println(address+" isMulticastSiteLocal? "+address.isMulticastSiteLocal());
            // System.out.println(address+" isMulticastLinkLocal? "+address.isMulticastLinkLocal());
            // System.out.println(address+" isMulticastNodeLocal? "+address.isMulticastNodeLocal());
            System.out.println(address+" is loopbackaddress? "+address.isLoopbackAddress());
            System.out.println(address+" is any local address: "+address.isAnyLocalAddress());
           System.out.println(address+" is linklocaladdress? "+address.isLinkLocalAddress());
           System.out.println(address+" is sitelocaladdress? "+address.isSiteLocalAddress());
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

//Site local address : isSiteLocalAddress();- 10.0.0.0
//Site local address means the address is used within a site or organization
            //Example of site local address is 10.0.0.1 - 10.0.0.255   and 172.16.0.0 - 172.31.255.255 and 192.168.0.0 - 192.168.255.255
//link is only used for private but site can be accessed with public IP

//if address is not of any type then all method return false
//Assignment :
//Ismulticastaddress
//isMulticastAddress();- 224.0.0.0 - 239.255.255.255
//Multicast address means the address is used to send a packet to multiple hosts
//Example of multicast address is 224.0.0.1

//isMulticastGlobal();- 233.0.0.0 - 233.255.255.255
//Multicast global address means the address is used to send a packet to multiple hosts across the internet

//isMulticastOrganizationLocal();- 239.192.0.0 - 239.255.255.255
//Multicast organization local address means the address is used to send a packet to multiple hosts within an organization

//isMulticastSiteLocal();- 239.255.0.0 - 239.255.255.255
//Multicast site local address means the address is used to send a packet to multiple hosts within a site or organization

//isMulticastLinkLocal();- 239.255.0.0 - 239.255.255.255
//Multicast link local address means the address is used to send a packet to multiple hosts within a link or local network

//isMulticastNodeLocal();- 239.255.0.0 - 239.255.255.255
//Multicast node local address means the address is used to send a packet to multiple hosts within a node or device

