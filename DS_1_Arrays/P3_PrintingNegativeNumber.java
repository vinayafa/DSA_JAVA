package Day1_Arrays;

import java.util.Scanner;

public class P3_PrintingNegativeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter Array Elements:  ");
        for (int i = 0; i <n ; i++) {
            arr[i]= sc.nextInt();
        }
        for (int i = 0; i <n ; i++) {
           if (arr[i]<0) System.out.print(arr[i]+ " ");

        }


    }
}
