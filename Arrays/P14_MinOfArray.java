package Day1_Arrays;

public class P14_MinOfArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int min = Integer.MAX_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]<min) min = arr[i];

        }
        System.out.println(min);
    }
}
