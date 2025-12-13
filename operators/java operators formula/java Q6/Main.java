/******************************************************************************

Q6.Write a Java Program to calculate Fahrenheit to Javaelsius

*******************************************************************************/
import java .util.*;

class Main{
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        double f= sc.nextDouble();
        
        double c=(5.0/9.0)*f-32;
        System.out.printf("Celsius: "+"%.2f",c);
    }
}