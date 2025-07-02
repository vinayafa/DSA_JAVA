package Day1_Arrays;

import java.util.Scanner;

public class P4_InputInArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x = new int[7];
        for (int i = 0; i < 7; i++) {
            x[i] = sc.nextInt();
        }
        for (int i = 0; i <7 ; i++) {
            System.out.print(x[i]+ " ");

        }


    }
}
