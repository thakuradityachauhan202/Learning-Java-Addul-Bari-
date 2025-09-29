import java.lang.*;
import java.util.*;
public class arraycopying {
public static void main(String[] args)
{
    int a[]={10,20,30,40};
    int b[]=new int[7];
    for(int i=0;i<a.length;i++)
    {
        b[i]=a[i];
    }
    System.out.print("b: ");
    for(int num:b)
    {
        System.out.println(num+" ");
    }
}
}
