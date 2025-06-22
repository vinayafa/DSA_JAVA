//Take 3 positive integers inut and tell if they can be the sides of a triangle or not.
package if_else_conditons;

import java.util.Scanner;

public class Sides_of_Triangle_orNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Side:  ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Side:  ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd Side:  ");
        int c = sc.nextInt();
        if (a + b > c && b + c > a && a + c > b) {
            System.out.println("Valid Triangle");
        } else System.out.println("Invalid Triangle");
    }
}
