/******************************************************************************

Q25.Write a Java Program to print your address in multiple lines using \n.

*******************************************************************************/
import java.util.*;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter Door No. and Street:");
        String street = sc.nextLine();
        System.out.println("Enter Area:");
        String area = sc.nextLine();
        System.out.println("Enter City and Pincode:");
        String city = sc.nextLine();

        System.out.println("\nYour Address:");
        System.out.println(name + "\n" + street + "\n" + area + "\n" + city);

    }
}
