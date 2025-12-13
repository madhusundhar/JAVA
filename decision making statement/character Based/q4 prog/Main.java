/******************************************************************************

Q4. Java Program to check whether a character is a digit or not

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    
	    if(Character.isDigit(c))
	    {
		System.out.println("digit");
	    }
	    else{
	        System.out.println("not digit");
	    }
	}
}