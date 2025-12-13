/******************************************************************************

Q10.Write a Java Program to print the sum of the first and last digit of a 3-digit number.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        int c=n/10;
        System.out.println(c);
    }
}