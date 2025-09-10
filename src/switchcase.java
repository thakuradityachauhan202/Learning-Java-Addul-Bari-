import java.lang.*;
import java.util.*;
public class switchcase {
    public static void main(string args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter day number");
        int day=scan.nextInt();
        switch(day)
        {
            case 1:System.out.println("monday");
            break;
            case 2:System.out.println("tuesday");
                break;
            case 3:System.out.println("wednesday");
                break;
            case 4:System.out.println("thursday");
                break;
            case 5:System.out.println("friday");
                break;
            case 6:System.out.println("saturday");
                break;
            case 7:System.out.println("sunday");
                break;
            case 8:System.out.println("invalid");
            break;
        }
    }
}
