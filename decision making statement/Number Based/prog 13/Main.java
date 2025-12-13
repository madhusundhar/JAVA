/******************************************************************************

Q13. Java Program to check whether a number is positive, negative, or zero

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
       
        
        if(a==0){
            System.out.println("Zero");
        }
        else if(a>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
