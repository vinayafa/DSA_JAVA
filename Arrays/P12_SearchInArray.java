package Day1_Arrays;

import java.util.Scanner;

public class P12_SearchInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,13,24,35,46,56,};
        int target = 13;
        boolean found = false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]== target){
                found= true;
                break;
            }
        }
        if (found) System.out.println("Target exists in Array");
        else System.out.println("Target missing in Array");
    }
}
