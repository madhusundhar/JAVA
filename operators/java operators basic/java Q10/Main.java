/******************************************************************************

Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        
        int a=n%10;
        int b=n/100;
        int c=a+b;
        System.out.println(c);
    }
}
