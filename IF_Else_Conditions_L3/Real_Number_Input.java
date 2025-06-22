//Take real number input and check if it is an integer or not.
package if_else_conditons;
import java.util.Scanner;
public class Real_Number_Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");

        //Method 1
        /*double n = sc.nextDouble();
        int x = (int) n;
        if (n - x > 0) System.out.println("Not an Integer");
        else System.out.println("Is an Integer");*/

        //Method 2
        double n = sc.nextDouble();
        if(n ==(int)n) System.out.println("Is an Integer");
        else System.out.println("Not an Integer");
    }
}
