import java.io.IOException;
import java.io.FileInputStream;
import java.io.Reader;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class Weblog{
    public static void main(String []args){
        String filePath="./Weblog.txt";
        try(FileInputStream fin=bew FileInputStream(filePath)){
            Reader in=new InputStreamReader(fin);
            BufferedReader bin=new BufferedReader(in);
            System.out.println(in);
            String data;
            while((data=bin.readLine())!=null){
                System.out.println(data);
                String[] lineData=data.split("\\ ");
                InetAddress address=InetAddress.getByName(lineData[0]);
                System.out.println(address);
            }

        }catch(IOException e){
            System.out.println(e);
        }
    }
}