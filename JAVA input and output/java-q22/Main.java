/******************************************************************************

Q22.Write a Java Program to print your marks in 5 subjects each on a new line.

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
		System.out.println("tamil:");
		int a=sc.nextInt();
		System.out.println("english:");
		int b=sc.nextInt();
		System.out.println("maths:");
		int c=sc.nextInt();
		System.out.println("physics:");
		int d=sc.nextInt();
		System.out.println("chemistry:");
		int e=sc.nextInt();
		
		System.out.println("tamil:"+a+"\n"+"tamilenglish:"+b+"\n"+"maths:"+c+"\n"+"physics:"+d+"\n"+"chemistry:"+e);
	}
}
