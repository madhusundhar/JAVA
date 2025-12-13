/******************************************************************************

Q11.Write a Java Program to print the middle digit of a 3-digit number.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        
        int a=n/10;
        int b=a%10;
        
        
        
        System.out.println(b);
    }
}