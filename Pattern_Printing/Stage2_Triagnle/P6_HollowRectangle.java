package PatternPrinting_Stage2_Triangles;

import java.util.Scanner;

public class P6_HollowRectangle {
    public static void main(String[] args) {
        System.out.println("Enter rows: ");
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        System.out.println("Enter Columns: ");
        int col = sc.nextInt();
        for (int i = 1; i <=row ; i++) { // To print Number of lines
            for (int j = 1; j <=col ; j++) {
                if (i==1 || i== row || j==1 || j==col)
                    System.out.print("* ");
                else System.out.print("  ");

            }
            System.out.println();

        }
    }
}
