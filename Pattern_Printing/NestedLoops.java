//Loop ke andar Loop
//Rectangle Printing
package PatternPrinting;

import java.util.Scanner;

public class NestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <=row ; i++) { // number of lines
            for (int j = 1; j <=col ; j++) { //number of star in each lines
                System.out.print("* ");

            }
            System.out.println();

        }

    }
}
