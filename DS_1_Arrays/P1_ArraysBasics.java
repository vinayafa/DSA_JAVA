package Day1_Arrays;

public class P1_ArraysBasics {
    public static void main(String[] args) {
        int[] x = {6,16,19,23,21,15,16}; //indexing
        System.out.println(x[5]);
        x[3] = 89; //updating of elements
        int[] arr = new int[4]; //new array of size 4
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        System.out.println(arr);
    }
}
