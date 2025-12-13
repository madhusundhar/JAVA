/******************************************************************************

Q12.Write a Java Program to print the absolute value of a given number.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        int a=(n>=0)? n:-n;
        System.out.println(a);
    }
}