//import java.net.InetAddress;
import java.net.UnknownHostException;

public class SpamCheckExample {
    // dns private static final String DNBSL="" hunxa tesma IP address rerevrse -
    private static final String DNBSL = "zen.spamhaus.org";

    public static void main(String[] args) {

        String ip = "127.0.0.2";
        checkSpam(ip);
    }

    public static boolean checkSpam(String ip) {
        try {
            String[] addressParts = ip.split("\\.");

            StringBuilder reversedIP = new StringBuilder();
            for (int i = addressParts.length - 1; i >= 0; i--) {
                // System.out.println(addressParts[i]);

                reversedIP.append(addressParts[i]);

                if (i != 0) {
                    reversedIP.append(".");
                }
            }

            // This is the DNSBL lookup domain
            String query = reversedIP + "." + DNBSL;
            System.out.println(query);

            // If you really want to check DNS:
            java.net.InetAddress addr = java.net.InetAddress.getByName(query);
            return true;
        } catch (UnknownHostException e) {
            System.out.println("Not listed in blacklist");
            return false;

        }

    }
}