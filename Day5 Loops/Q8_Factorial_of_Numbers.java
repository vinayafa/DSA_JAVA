package Loops_L5;

import java.util.Scanner;

public class Q8_Factorial_of_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact *= i;
        }
        System.out.println(fact);

    }
}
