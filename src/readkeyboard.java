import java.lang.*;
import java.util.*;
public class readkeyboard {
    public static void main(String args[])

    {
        Scanner sc=new Scanner(System.in);
             int x,y;
             System.out.print("enter 2 numbers");
             x=sc.nextInt();
             y=sc.nextInt();

             int z=x+y;
             System.out.print("sum is "+z);
    }
}
