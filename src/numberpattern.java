import java.lang.*;
import java.util.*;
public class numberpattern {
    public static void main(String[] agrs)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5-i+1;j++)
            {
                System.out.print(j+" ");
            }
            System.out.print(" ");
        }
    }
}
