package PatternPrinting_Stage1_Square_and_Rectangle;

import java.util.Scanner;

public class P1_StarRectangle {
    public static void main(String[] args) {
        System.out.println("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter Columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <=row ; i++) { // To print Number of lines
            for (int j = 1; j <=col ; j++) { // To print Number of Columns
                System.out.print("*  ");

            }
            System.out.println();

        }
    }
}
