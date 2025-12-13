/******************************************************************************

Q5.Write a Java Program to find the distance between two points

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        int x1= sc.nextInt();
        int x2= sc.nextInt();
        int y1= sc.nextInt();
        int y2= sc.nextInt();
        
       double c=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
        System.out.printf("Distance"+"%.2f",c);
    }
}
