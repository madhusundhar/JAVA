/******************************************************************************
Q17.Write a Java Program to check if a number is power of 2 using bitwise AND.
*******************************************************************************/
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean a =((n & (n - 1))==0)&(n > 0);
        System.out.println(a);
    }
}