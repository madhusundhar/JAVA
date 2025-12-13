/******************************************************************************

A shopkeeper sells an item at a profit. Given cost price and profit, 
calculate the selling price using: SP = CP + Profit.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int CP=sc.nextInt();
        int profit=sc.nextInt();
        
        int Sp=CP+profit;
        
        System.out.println("SP: "+Sp);
        
        
    }
}