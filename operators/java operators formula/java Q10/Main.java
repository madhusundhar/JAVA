/******************************************************************************

Q10.Write a Java Program to find Perimeter of a Triangle

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        int d= sc.nextInt();
        int c=(a+b+d);
        System.out.println("Perimeter of Triangle: "+c);
    }
}