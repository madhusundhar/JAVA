/******************************************************************************

Q7.Write a Java Program to calculate celsius to Fahrenheit

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        double c= sc.nextDouble();
        
        double f=c*(5.0/9.0)+32;
        System.out.printf("Fahrenheit: "+"%.2f",f);
    }
}