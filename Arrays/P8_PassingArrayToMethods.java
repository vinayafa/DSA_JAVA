package Day1_Arrays;

public class P8_PassingArrayToMethods {
    public static void main(String[] args) {
     int[] x = {10, 3, 29, 38, 40};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }

    public static void change(int[] x) {
        x[2] = 99;

    }
}
