package PatternPrinting_Stage1_Square_and_Rectangle;

import java.util.Scanner;

public class P3_NumberPattern_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print(j+ " "  );

            }
            System.out.println();
        }
    }
}
