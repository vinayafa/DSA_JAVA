//Logical and Logical OR
// Take positive integer input and tell if it is a four digit number or not
package if_else_conditons;
import java.util.Scanner;
public class Four_DIgitNumber_ornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        if(n>999 && n<10000) System.out.println("Four Digit Number");
        else System.out.println("Not a four digit number");
    }
}
