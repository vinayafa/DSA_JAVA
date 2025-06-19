//Count Digit of a Number
package Loops_L5;

import java.util.Scanner;

public class Q5_Couny_Digit_of_Number {
    public static void main(String[] args) {
        System.out.println("Enter Number:  ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        while(n!=0){
          n/=10;
            count++; // ya calculate karega how much time this loop is running
        }
        System.out.println(count);
    }
}
