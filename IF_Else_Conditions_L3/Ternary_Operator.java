//Take Positive integer and check whether it is Even or ODD
package if_else_conditons;

import java.util.Scanner;

public class Ternary_Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        // Conditions ? True : False
        System.out.println((n%2==0)? "Even" : "ODD");
    }
}
