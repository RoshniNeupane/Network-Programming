import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.net.InetAddress;
import java.net.*;
public class NetworkInterfaceExample {
    public static void main(String[]args){
        try{
        //     Enumeration<NetworkInterface>ni=NetworkInterface.getNetworkInterfaces();
        //     while(ni.hasMoreElements()){
        //    NetworkInterface address=ni.nextElement();
        //        System.out.println(address.getName());
        //        System.out.println(address.getIndex());
        //        System.out.println(address.isLoopback());
        //        System.out.println(address.getNetworkInterfaces());
        //     }
           NetworkInterface ni=NetworkInterface.getByName("127.0.0.1");
           Enumeration<InetAddress> address=ni.getInetAddresses();
             while(address.hasMoreElements()){
           InetAddress addresses=address.nextElement();
               System.out.println(addresses);
        //     //    System.out.println(address.getIndex());
        //     //    System.out.println(address.getNetworkInterfaces());
        //     // }
        }
    }catch(SocketException e){
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


