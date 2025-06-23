package PatternPrinting_Stage1_Square_and_Rectangle;

import java.util.Scanner;

public class P2_SquareStars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
