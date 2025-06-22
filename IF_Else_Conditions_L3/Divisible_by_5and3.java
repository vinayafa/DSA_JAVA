//Take a positive integer input and tell if it is divisible by 5 or 3.
package if_else_conditons;
import java.util.Scanner;
public class Divisible_by_5and3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        if(n%5==0 || n%3 ==0) System.out.println("Divisible by 5 or 3");
        else System.out.println("Not Divisible by 5 or 3");
    }
}
