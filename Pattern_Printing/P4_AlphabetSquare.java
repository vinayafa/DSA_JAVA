//A B C D E
//A B C D E
//A B C D E
//A B C D E

package PatternPrinting_Stage1_Square_and_Rectangle;

import java.util.Scanner;

public class P4_AlphabetSquare {
    public static void main(String[] args) {
        System.out.println("Enter Alphabet: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n ; j++) {
                System.out.print((char)(j+64)+ "  "); //in this we type cast the value ,ASCII value j+64

            }
            System.out.println();

        }

    }
}
