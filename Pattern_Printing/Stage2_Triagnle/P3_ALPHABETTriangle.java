package PatternPrinting_Stage2_Triangles;

import java.util.Scanner;

public class P3_ALPHABETTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print((char)(i+64)+ " ");

            }
            System.out.println();
        }

    }

}
