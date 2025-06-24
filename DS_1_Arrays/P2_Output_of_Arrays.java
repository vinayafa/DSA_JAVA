package Day1_Arrays;

import java.util.Scanner;

public class P2_Output_of_Arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,-8,2,67,54,21};
        System.out.println("Length of array:  " + arr.length);
        System.out.print("Elements of arrays:  ");
        for (int i = 0; i <=5; i++) {
            System.out.print( arr[i]+" ");



        }
    }
}
