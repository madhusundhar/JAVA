/******************************************************************************

Three friends eat at a restaurant and get a single bill. They want to split the total bill equally. 
The program calculates how much each friend must pay.

*******************************************************************************/
import java.util.*;
 class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Bill amount: ");
	    int a=sc.nextInt();
	    
	    double b=a/3;
	  
	    
		System.out.println("split amount : "+b);
		
	}
}