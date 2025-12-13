/******************************************************************************
Q8.Java Program to print the last digit of given number N

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        int c=n%10;
        System.out.println(c);
    }
}