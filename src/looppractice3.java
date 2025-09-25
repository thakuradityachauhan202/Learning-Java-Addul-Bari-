import java.lang.*; // Import statement needed
import java.util.*;
public class looppractice3 {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);

        System.out.println("enter a number");
        int n = Scan.nextInt();

        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        System.out.println(count); // Output the count variable, not just the string "count"
    }
}
