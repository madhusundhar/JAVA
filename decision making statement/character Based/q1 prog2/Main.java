/******************************************************************************

Q2. Java Program to check whether a given character is uppercase, lowercase, digit, or special symbol

*******************************************************************************/
import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        char a= sc.next().charAt(0);
        
        if(Character.isDigit(a)){
            System.out.println("digit");
        }
        else if(Character.isUpperCase(a)){
            System.out.println("uppercase");
        }
         else if(Character.isLowerCase(a)){
            System.out.println("lowercase");
        }
        else{
            System.out.println("special symbol");
        }
    }
}