//travesring

package Day1_Arrays;

import java.util.Scanner;

public class P5_SumofElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {-6,8,14,23,-2,11};
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];

        }
        System.out.println(sum);

    }
}
