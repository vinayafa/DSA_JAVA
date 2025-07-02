package Day2_Arrays;

public class P1_TwoSumGFG {
    public static void main(String[] args) {
        int[] arr = { 2, 3 , 5, 4, 8, 10};
        int n = arr.length;
        int target = 2;
        boolean found = false;
        for (int i = 0; i <n ; i++) {
            for (int j =i+1; j <n ; j++) {
                if (arr[i]+arr[j]== target){
                    found = true;
                    break;
                }

            }
            if (found) System.out.print("Twom sum done ");
            else System.out.println("Nhi mila");

        }
    }
}
