/******************************************************************************

Q17. Java Program to check whether two numbers have the same last digit

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c=a%10;
        int d=b%10;
        if(c==d){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}