/******************************************************************************

Q5. Java Program to check whether three sides form a valid triangle
a+b>c
a+c>b
b+c>a

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        
        if(a+b>c || a+c>b || b+c>a){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("not valid triangle");
        
    }
    }
}
