// Write a program to print Composite Numbers
package Loops_L5;

import java.util.Scanner;

public class Q1_CompositeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = sc.nextInt();
        boolean flag = true;//0 means prime // boolean wala kam kiya h yaha bhi
        for (int i = 2; i <=n-1 ; i++) {
            if(n%i == 0){ //'i' to n ka ek factor nikla
                System.out.println("Composite number");
              flag = false;
                break;
            }

        }if (n==1) System.out.println("Neither Prime nor compostie");
        else if (flag == false) System.out.println("Composite Number");
        else System.out.println("Prime number");
    }
}
