//adding two matrices
import java.lang.*;
import java.util.*;

public class twodarraypractice2 {
    public static void main(String[] args)
    {
        int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int b[][] = {{9,8,7},{6,5,4},{3,2,1}};

        int c[][] = new int[3][3];

        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[0].length; j++)
            {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
