/******************************************************************************

Q5. Java Program to check whether two characters are equal or not

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    char b=sc.next().charAt(0);
	    
	    if(c==b)
	    {
		System.out.println("equal");
	    }
	    else{
	        System.out.println("not equal");
	    }
	}
}