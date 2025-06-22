//Tke lenght and breadth of rectangle as input and write a program to find whether the area of rectangle is greater than its perimeter
package if_else_conditons;

import java.sql.SQLOutput;
import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of Rectangle: ");
        double a = sc.nextDouble();
        System.out.println("Enter breadth of Rectangle: ");
        double b = sc.nextDouble();
        double area = a*b;
        double perimeter = 2*(a+b);
        System.out.println("Area is:" + area);
        System.out.println("Perimeter is:" + perimeter);
        if(area>perimeter) System.out.println("Area is Greater");
        else System.out.println("Perimeter is Greater");
    }
}
