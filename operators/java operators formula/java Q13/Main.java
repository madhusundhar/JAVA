/******************************************************************************

Q13.Write a Java Program to find Surface Area and Volume of a cuboid

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int l=sc.nextInt();
        int b=sc.nextInt();
        int h=sc.nextInt();
        
        double s=2*(l*b+b*h+h*l);
        double v=(l*b*h);
        
        System.out.println("surface: "+s);
        System.out.println("volume: "+v);
        
    }
}