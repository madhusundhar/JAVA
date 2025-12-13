/******************************************************************************

Q5.Write a Java Program to check whether a given year and month combination is valid and print 
the number of days in that month (consider leap years for February).

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int year = sc.nextInt();
        int month = sc.nextInt();

        boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
        } else {
            int days;

            if (month == 2) {
                days = leap ? 29 : 28;
            }
            else if (month == 4 || month == 6 || month == 9 || month == 11) {
                days = 30;
            }
            else {
                days = 31;
            }

            System.out.println("Valid month");
            System.out.println("Number of days: " + days);
        }
    }
}
