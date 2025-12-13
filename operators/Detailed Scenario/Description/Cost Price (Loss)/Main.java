/******************************************************************************

A product is sold at a loss. Given selling price and loss amount, 
the program calculates the cost price using: CP = SP + Loss.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int sp=sc.nextInt();
        int loss=sc.nextInt();
        
        int cp=sp+loss;
        
        System.out.println("cp: "+cp);
        
        
    }
}