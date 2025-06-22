//Take Positive integer input and tell if it is odd or even?
package if_else_conditons;
import java.util.Scanner;
public class OddEvenip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        /*First Method
        if(n%2 == 0) System.out.println("Even Number");
        else System.out.println("Odd Number"); */

        //Second Method
        if(n%2 == 0){
            System.out.println("Even Number");
            System.out.println("YES PARTY");
        } else{
            System.out.println("Odd number");
            System.out.println("Party Cancel");
        }



    }
}
