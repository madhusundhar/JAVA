/******************************************************************************

Q18. Java Program to check whether a number is a single-digit, two-digit, or three-digit number

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
        
        
        if(a==0 && a<9){
            System.out.println("single-digit");
        }
        else if(a==10&&a<=99){
            System.out.println("two-digit");
        }
        else{
            System.out.println("three-digit ");
        }
    }
}