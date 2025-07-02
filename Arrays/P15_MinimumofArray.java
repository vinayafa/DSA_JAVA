package Day1_Arrays;

import java.util.Scanner;

public class MinimumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-6,8,14,23,-2,11};
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min) min=arr[i];
        }
        System.out.println(min);

    }
}
