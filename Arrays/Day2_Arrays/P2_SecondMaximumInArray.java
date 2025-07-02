package Day2_Arrays;

public class P2_SecondMaximumInArray {
    public static void main(String[] args) {
        int[] arr = {23,54,12,13,89,45,66};
        int max= Integer.MIN_VALUE;
        int smax= Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]>max) max= arr[i];

        }
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>smax && arr[i]!= max) smax=arr[i];
        }
        System.out.println(max);
        System.out.println(smax);
    }
}
