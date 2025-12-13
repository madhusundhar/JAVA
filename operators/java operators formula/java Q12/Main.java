/******************************************************************************
Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of a cube

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        double s=6*(a*a);
        double v=b*b*b;
        double p=12*c;
        
        System.out.println("Surface: "+s);
        System.out.println("Volume: "+v);
        System.out.println("Perimeter: "+p);
    }
}