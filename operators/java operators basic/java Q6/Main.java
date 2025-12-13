/******************************************************************************
Q6.Write a Java Program to Swap two numbers using third variable

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int a=s.nextInt();
        int b=s.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println(a+"\n"+b);
    }
}