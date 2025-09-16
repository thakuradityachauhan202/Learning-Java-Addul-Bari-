import java.lang.*;
import java.util.*;
public class looppractice2 {
    public static void main(String[] args)
    {Scanner sc=new Scanner(System.in);
            System.out.println("enter a number");
        int n=sc.nextInt();

        int sum=0;
        for( int i=1; i<=10; i++)
        {
            sum = sum+i;
        }
        System.out.println("sum of"+n+"number is"+sum);
    }
}
