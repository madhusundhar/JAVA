/******************************************************************************

A shop offers festival discounts. The customer enters the original price and discount percentage. 
The program must calculate the discount amount and the final price payable after applying the discount.

*******************************************************************************/
import java.util.*;
 class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    double c=(b/100.0)*a;
	    double d=a-c;
	    
		System.out.println("Final: "+c);
		System.out.println("discount: "+d);
	}
}
