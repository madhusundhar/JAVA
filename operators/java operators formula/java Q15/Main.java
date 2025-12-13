/******************************************************************************

Q15.Write a Java Program to find Surface Area and Volume of a cylinder
*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int r=sc.nextInt();//A=2πrh+2πr2
        int h=sc.nextInt();
        
        
        double a=(2*Math.PI*r*h)+(2*Math.PI*r*2);
        double v=Math.PI*r*r*h;
        
        System.out.println("surface: "+a);
        System.out.println("volume: "+v);
        
    }
}