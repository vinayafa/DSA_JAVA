// Check weather a Number is Divisible by 5 or not.
package if_else_conditons;
import java.util.Scanner;
public class divisible_by_5or_Not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        if(n%5 == 0){
            System.out.println("Divisble By 5.");
        } else{
            System.out.println("Not Divisble By 5.");
        }
    }
}
