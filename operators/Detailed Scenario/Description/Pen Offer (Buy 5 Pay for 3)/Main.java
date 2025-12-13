/******************************************************************************

A stationery shop offers: Buy 5 pens, pay only for 3. Given price per pen and pens bought, 
the program calculates how many pens need to be paid for and total cost.

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();   
        int pens = sc.nextInt();    

        int groups = pens / 5;
        int paidPens = pens - (groups * 2);
        int totalCost = paidPens * price;

        System.out.println("Pens to pay for: " + paidPens);
        System.out.println("Total cost: " + totalCost);
    }
}

