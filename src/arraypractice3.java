import java.lang.*;
import java.util.*;
public class arraypractice3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a[] = {1,2,3,4,5};
        int key;
        System.out.println("enter a key");
        key = sc.nextInt();
        for(int i=0; i<a.length; i++) {
            if(key == a[i]) {
                System.out.println("element found at :" + i);
                System.exit(0);
            }
        }
        System.out.println("not found");
    }
}
