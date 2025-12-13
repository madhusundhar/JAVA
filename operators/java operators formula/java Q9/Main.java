/******************************************************************************

Q9.Write a Java Program to find Perimeter of a Rectangle

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        
        int c=2*(a+b);
        System.out.println("Perimeter of Rectangle: "+c);
    }
}