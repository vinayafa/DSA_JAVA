package Day1_Arrays;

import java.util.Arrays;

public class P11_SortArrayBuiltIn {
    public static void main(String[] args) {
        //sort-ascending order
        int[] arr = {4,5,3,2,7,9,10};
        print(arr);
        Arrays.sort(arr);
        print(arr);
    }
    public static void print(int[] arr) {
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");

        }
        System.out.println();

    }
}
