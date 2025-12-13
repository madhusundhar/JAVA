/******************************************************************************

Q14. Write a Java Program to print the cube of a given number

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        
        int n=s.nextInt();
        int a=n*n*n;
        System.out.println(a);
    }
}
