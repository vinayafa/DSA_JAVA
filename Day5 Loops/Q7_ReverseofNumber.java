package Loops_L5;

import java.util.Scanner;

public class Q7_ReverseofNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);                  // Line 1: Create Scanner object for input
        System.out.print("Enter a number: ");                 // Line 2: Ask the user for a number
        int num = sc.nextInt();                               // Line 3: Read the number into variable 'num'

        int reverse = 0;                                      // Line 4: Variable to store the reversed number

        while (num > 0) {                                     // Line 5: Loop runs until all digits are processed
            int digit = num % 10;                             // Line 6: Get the last digit
            reverse = reverse * 10 + digit;                   // Line 7: Append digit to the reverse
            num = num / 10;                                   // Line 8: Remove the last digit
        }

        System.out.println("Reversed number: " + reverse);    // Line 9: Print the result
        sc.close();                                           // Line 10: Close Scanner

    }
}
