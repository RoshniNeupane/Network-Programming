import java.net.InetAddress;
public class TestingReachability {
    public static void main(String[] args) {
        try {
            InetAddress address = InetAddress.getByName("www.google.com");
            InetAddress address2= InetAddress.getByName("www.google.com");
            if(address.equals(address2)){
                System.out.println("is equal");
            }else{
                System.out.println("is not equals");
            }
            // if (address.isReachable(50)) {
            //     System.out.println(address + " is reachable");
            // } else {
            //     System.out.println(address + " is not reachable");
            // }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

//Equals 
//object methods : boolean -equals,int- hashcode,String- toString
