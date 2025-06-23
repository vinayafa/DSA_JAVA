// a b c d e
// a b c d e
// a b c d e
// a b c d e
// a b c d e


package PatternPrinting_Stage1_Square_and_Rectangle;

import java.util.Scanner;

public class P5_SmallAlphabetSquare {

        public static void main(String[] args) {
            System.out.println("Enter Alphabet: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    System.out.print((char) (j + 96) + "  "); //in this we type cast the value ,ASCII value, 96 is for small caps

                }
                System.out.println();

            }
        }

}
