import java.lang.*;
import java.util.*;
public class arthmaticoperators
{
    public static void main(String args[])
    {
        float base,height,area;
        System.out.println("enter base and height");
        Scanner sc=new Scanner(System.in);

        base=sc.nextFloat();
        height=sc.nextFloat();
        area=base*height/2;

        System.out.print("area of triangle" + area);
    }
}
