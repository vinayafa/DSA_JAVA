package Day1_Arrays;

import java.util.Arrays;

public class P9_ShallowCopyArrays {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};
//        int[] x= arr; // x is a shallow copy of arr
//        x[0] = 100;
        int[] y = Arrays.copyOf(arr, arr.length); //deep copy //builtin method
        y[0] = 100;
        System.out.println(y[0]);
    }
}
