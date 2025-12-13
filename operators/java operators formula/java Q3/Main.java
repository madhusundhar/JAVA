/******************************************************************************
Q3.Write a Java Program to find area of Triangle

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
        int b=sc.nextInt();
        int g=sc.nextInt();
        
        double c=(0.5)*a*g;
        System.out.println("area of Triangel: "+c);
    }
}