/******************************************************************************

Q21.Write a Java Program to print your roll number and name in the format: Roll No: 123, Name: John

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    
	    System.out.println("Roll No:");
	    int a=sc.nextInt();
	    System.out.println("Name:");
	    String b=sc.next();
	    
	    System.out.println("Roll No:"+a+", Name:"+b);
	}
}
