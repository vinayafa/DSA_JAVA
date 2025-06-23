//A A A A
//B B B B
//C C C C
//D D D D
package PatternPrinting_Stage1_Square_and_Rectangle;

import java.util.Scanner;

public class P8_AlphabetPatternSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row; j++) {
                System.out.print((char)(i+64)+ " "  );

            }
            System.out.println();
        }
    }
}
