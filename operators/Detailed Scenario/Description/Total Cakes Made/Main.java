/******************************************************************************

A bakery produces a fixed number of cakes every hour. Given cakes per hour and total hours, 
the program calculates total cakes made.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int cake=sc.nextInt();
        int hours=sc.nextInt();
        int total=cake*hours;
        
        System.out.println("total: "+total);
        
        
    }
}
