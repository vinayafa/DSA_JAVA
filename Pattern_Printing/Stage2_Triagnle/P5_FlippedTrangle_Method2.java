package PatternPrinting_Stage2_Triangles;

import java.util.Scanner;

public class P5_FlippedTrangle_Method2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a= n;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=a ; j++) {
                System.out.print(j+ " ");

            }
            a--;
            System.out.println();
        }

    }
}
