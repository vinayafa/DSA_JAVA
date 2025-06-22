//Take Integer input and print the absolute value of that integer
package if_else_conditons;
import java.util.Scanner;
public class Absolute_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:");
        int n = sc.nextInt();
        //Method 1
        /*if (n >= 0) System.out.println(n);
        else System.out.println(-n);*/

        //Method 2
        if(n<0) n= -n;
        System.out.println(n);
    }
}
