package Loops_L5;

import java.util.Scanner;

public class Q2_PrintingofFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              // Line 1: Create Scanner object to take input from user
        System.out.print("Enter a number: ");             // Line 2: Prompt user to enter a number
        int num = sc.nextInt();                           // Line 3: Read the entered number and store in 'num'
        System.out.println("Factors of " + num + " are:"); // Line 4: Print heading
        for (int i = 1; i <= num; i++) {                  // Line 5: Loop from 1 to the number
            if (num % i == 0) {                           // Line 6: If 'i' divides 'num' exactly, it's a factor
                System.out.println(i);                    // Line 7: Print the factor
            }
        }

        sc.close();                                       // Line 8: Close the Scanner object
    }
}
