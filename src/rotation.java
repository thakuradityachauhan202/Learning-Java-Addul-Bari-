import java.util.*;
public class rotation {
    public static void main(String args[]) {
        int A[] = {1,2,3,4,5,6,7,8,9};

        // Print original array
        for(int X : A)
            System.out.print(X + ",");
        System.out.println("");

        // Store first element for rotation
        int temp = A[0];

        // Shift left
        for(int i = 1; i < A.length; i++)
            A[i - 1] = A[i];

        // Place the first element at the end
        A[A.length - 1] = temp;

        // Print rotated array
        for(int X : A)
            System.out.print(X + ",");
        System.out.println("");
    }
}

