/******************************************************************************

Q4. Java Program to check whether the sum of three angles forms a valid triangle.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int n=a+b+c;
        if(n==180){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("not valid triangle");
        
    }
    }
}