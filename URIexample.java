import java.net.URI;
import java.net.URISyntaxException;

public class URIexample {
    public static void main(String[]args){
         try{
      URI uri=new URI("https://roshni::ros@www.samsung.com:8081/us/?search=phone#ros");
      URI uri2=new URI("Https:","roshni::ros@www.samsung.com:8081/us/?search=phone","#ros");
      URI uri3=new URI("Https:","www.samsung.com","/us/","ros");
      String path=uri.getPath();
      System.out.println("path = "+path);
      String query=uri.getQuery();
      System.out.println("Query = "+query);
      String fragment=uri.getFragment();
      System.out.println("Fragment = "+ fragment);
      String authority=uri.getAuthority();
      System.out.println("Authority = "+authority);
      String host=uri.getHost();
      System.out.println("Host = "+host);
      int port=uri.getPort();
       System.out.println("Port = "+port);
      String scheme=uri3.getScheme();
      System.out.println("Scheme = "+scheme);
     String schemeschemeString=uri.getSchemeSpecificPart();
     System.out.println(schemeschemeString);
     
    }catch(URISyntaxException e){
      System.out.println(e);
    }
   
    }
}
