/******************************************************************************

A fruit shop has an offer: Buy 3 mangoes and get 1 free. 
Based on the mango price and total mangoes purchased, compute total mangoes received and amount to pay.

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int price = sc.nextInt();     
        int bought = sc.nextInt();    

        int free = bought / 3;
        int total = bought + free;
        int amount = bought * price;

        System.out.println("Free mangoes: " + free);
        System.out.println("Total mangoes received: " + total);
        System.out.println("Amount to pay: " + amount);
    }
}

