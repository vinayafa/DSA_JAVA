package Day1_Arrays;

public class P13_ProductofElementsofArrays {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6};
        int product = 1;
        for (int i = 0; i <arr.length ; i++) {
            product *= arr[i];

        }
        System.out.println(product);
    }
}
