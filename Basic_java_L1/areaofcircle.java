package Basics_of_JAVA_Day1;
import java.util.Scanner;
public class areaofcircle {
    public static void main(String[] args) {
        //Area hota h pi*r*r

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius");
        double r = sc.nextDouble();
        double a = 3.141592 * r * r;
        System.out.print("Area is: ");
        System.out.println(a);
    }
}
