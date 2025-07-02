package Day3_Arrays;

import java.util.ArrayList;

public class P1_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(21);
        arr.add(22);
        arr.add(25);
        System.out.println(arr);
        int n = arr.size();
        for (int i = 0; i <n ; i++) {
            System.out.print(arr.get(i)+ " ");

        }
        arr.add(78);
        arr.add(1,100);
        System.out.println(arr);
    }
}
