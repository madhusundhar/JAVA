/******************************************************************************

Q2.Java Program to check whether a given year is a century year or not.

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();

        if (year%100==0) {
            System.out.println("century year");
        } else {
            System.out.println("Not century year");
        }
    }
}