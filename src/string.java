import java.lang.*;
import java.util.*;
public class string {
    public static void main(string args[])
    {
        String str = "programmer@gmail.com";


        int i = str.indexOf("@");
        String uname = str.substring(0, i);
        String domain = str.substring(i + 1, str.length());


        System.out.println("username:"+uname);
        System.out.println("domain:"+domain);

        System.out.println(domain.startsWith("gmail"));
    }
}
