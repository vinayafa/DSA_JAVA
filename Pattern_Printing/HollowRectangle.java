package PatternPrinting;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        for (int i = 1; i <=row ; i++) { // number of lines
            for (int j = 1; j <=col ; j++) {
                if(i==1 || i==row || j==1 || j==col)
                      System.out.print("*  ");

            }
            System.out.println();

        }

    }
}
