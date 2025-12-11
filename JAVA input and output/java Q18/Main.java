/******************************************************************************

Q18.Write a Java Program to print your date of birth in the format DD/MM/YYYY.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Enter your date of birth");
		Scanner sc=new Scanner(System.in);
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		System.out.println(a+"/"+b+"/"+c);
	}
}
