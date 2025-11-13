import java.net.MalformedURLException;
import java.net.URL;
public class UrlExample {
    public static void main(String[]args){
        try{
      URL url=new URL("https://roshni::ros@www.samsung.com:8081/us/?search=phone");
      String protocol=url.getProtocol();
      System.out.println("Protocol "+protocol);

      String host=url.getHost();
      System.out.println("Host "+host);

      int port=url.getPort();
      System.out.println("Port "+port);

      String file=url.getFile();
      System.out.println("File "+file);

      String authority=url.getAuthority();
      System.out.println("Authority "+authority);

      String userinfo=url.getUserInfo();
      System.out.println("UserInfo "+userinfo);

      String query=url.getQuery();
      System.out.println(query);


        }catch(MalformedURLException e){
            System.out.println(e);
        } 
       
    }
}

