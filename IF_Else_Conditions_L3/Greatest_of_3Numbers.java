package if_else_conditons;

import java.util.Scanner;
public class Greatest_of_3Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st no:  ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd no:  ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd no:  ");
        int c = sc.nextInt();

        //Method 1 But when all are equal it doent work
        /*if (a > b && a > c) System.out.println(a);
        if (b > a && b > c) System.out.println(b);
        if (c > a && b > a) System.out.println(c);*/

        //Method 2
        /*if(a>=b && a>=c) System.out.println(a);
        else if (b>=a && b>=c) System.out.println(b);
        else System.out.println(c);*/

        //Method 3 NESTED IF ELSE
        if(a>b &&a>c){
            System.out.println(a);
        }
        else{
            if (b>a && b>c) System.out.println(b);
            else System.out.println(c);
        }
    };
}
