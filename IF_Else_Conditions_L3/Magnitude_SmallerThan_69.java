// Take integer input and tell if its magnitude is smaller than 69 or not.
package if_else_conditons;
import java.util.Scanner;
public class Magnitude_SmallerThan_69 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number:  ");
        int n = sc.nextInt();
        if(n<0) n= -n;
        if(n<69){
            System.out.println("Smaller than 69");

        }else System.out.println("Not Smaller than 69");
    }

}
