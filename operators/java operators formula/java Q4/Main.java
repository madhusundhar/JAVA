/******************************************************************************

Q4.Write a Java Program to find area of Javaircle

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
        
        
       double c=Math.PI*a*a;
        System.out.printf("area of circle: "+"%.2f",c);
    }
}