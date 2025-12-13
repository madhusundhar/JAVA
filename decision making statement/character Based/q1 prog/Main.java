/******************************************************************************

Q1. Java Program to check whether a given character is a vowel or consonant

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        char a= sc.next().charAt(0);
        
        
        if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u'||a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
            System.out.println("vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}