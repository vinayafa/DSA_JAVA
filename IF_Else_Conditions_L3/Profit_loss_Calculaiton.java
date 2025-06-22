//If cost price and selling price of an item is input through the keyboard,
// write a program to determine whether the seller has made profit or incurred loss or no
// profit or no loss. Also determine how much profit he made or loss he incurred..
package if_else_conditons;
import java.util.Scanner;
public class Profit_loss_Calculaiton {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost Price :  ");
        int cp = sc.nextInt(); //cp= cost price
        System.out.println("Enter Selling Price: ");
        int sp = sc.nextInt();

        //Method 1 , in this whole code will be scanned
        /*if (sp > cp) System.out.println("Profit is " + (sp-cp));
        if (cp > sp) System.out.println("Loss" + (cp-sp));
        if (sp == cp) System.out.println("No profit No loss");*/

        //Method 2, in this if condition fails then we go inside otherwise it will give output
        if(sp>cp) System.out.println("Profit is  " +(sp-cp));
        else if (cp>sp) System.out.println("Loss is " + (cp-sp));
        else System.out.println("No Profit No loss");

    }

}
