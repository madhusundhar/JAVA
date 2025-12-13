/******************************************************************************

Q15. Write a Java Program to calculate the average of three numbers

*******************************************************************************/
import java.util.*;
class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a =sc.nextInt();
	    int b =sc.nextInt();
	    int c =sc.nextInt();
	    int n=a+b+c;
	    int x=n/3;
		System.out.println(x);
	}
}
