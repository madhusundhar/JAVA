/******************************************************************************
Q3. Java Program to check whether a character is alphabet or not

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc= new Scanner(System.in);
	    char c=sc.next().charAt(0);
	    
	    if(Character.isLetter(c))
	    {
		System.out.println("alphabet");
	    }
	    else{
	        System.out.println("not alphabet");
	    }
	}
}