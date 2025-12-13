/******************************************************************************

Q20.Write a Java Program to print pass/fail result based on marks.

*******************************************************************************/
import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if(marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
