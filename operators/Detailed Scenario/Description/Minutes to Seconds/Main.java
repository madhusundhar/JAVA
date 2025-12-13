/******************************************************************************

A student measures experiment time in minutes but needs the time in seconds. 
The program should convert minutes into seconds.

*******************************************************************************/
import java.util.*;
 class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("enter minutes:");
	    int a=sc.nextInt();
	    ;
	    int b=a*60;
	    
		System.out.println("seconds: "+b);
		
	}
}
