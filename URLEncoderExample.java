import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class URLEncoderExample {
    public static void main(String[]args){
      
       try{
          String url="Roshni _+Neupane";
          String encodedURl=URLEncoder.encode(url,"UTF-8");
          System.out.println(url);
          System.out.println(encodedURl);
          String decodeString=URLDecoder.decode(encodedURl, "UTF-8");
          System.out.println(decodeString);
       }catch(UnsupportedEncodingException e){
        System.out.println(e);
       }
    }
}
