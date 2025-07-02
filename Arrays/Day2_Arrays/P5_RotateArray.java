package Day2_Arrays;

import com.sun.source.tree.WhileLoopTree;

import static java.util.Collections.reverse;

public class P5_RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int d= 2;
        int n = arr.length;
        d%=n;
        reverse(arr,0,d-1);
        reverse(arr,d,n-1);
        reverse(arr,0,n-1);
    }

    public static void reverse(int[] arr, int i, int j ) {
        while(i<j){
            int temp = arr[i];
            arr[i]= arr[j];
            arr[j]= temp;
            i++;
            j--
                    ;
        }

    }
}
