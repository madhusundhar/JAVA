/******************************************************************************

Q16.Write a Java Program to check whether two numbers are equal True if equal else False.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n =sc.nextInt();
	    int m =sc.nextInt();
	   
		System.out.println((n==m)&&(m==n));
	}
}