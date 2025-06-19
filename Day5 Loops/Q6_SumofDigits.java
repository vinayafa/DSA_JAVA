//Print sum of Digit of a number
package Loops_L5;

import java.util.Scanner;

public class Q6_SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n!=0){
            int digit = n%10;
            sum = sum + digit;
            n/=10;

        }
        System.out.println("Sum of Digits:  " + sum);



    }
}
