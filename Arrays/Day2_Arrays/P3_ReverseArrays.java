//2 Variable/pointer Technique

package Day2_Arrays;

public class P3_ReverseArrays {
    public static void main(String[] args) {
        int[] arr = {23,54,12,13,89,45,66};
        int n= arr.length;
        int i = 0, j=n-1;
        while (i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
        for (int ele : arr) System.out.print(ele+" ");


    }
}
