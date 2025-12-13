/******************************************************************************

Q20.Java Program to check whether the ASCII value of a character is even or odd.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        char a= sc.next().charAt(0);
        int  c=(int)a;
        
        if(c%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}