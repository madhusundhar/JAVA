/******************************************************************************

A teacher distributes candies equally among students.
The program finds how many candies each student gets and how many remain undistributed.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int student=sc.nextInt();
        int candil=sc.nextInt();
        int get=candil/student;
        int remain=candil%student;
        
        System.out.println("each get: "+get);
        System.out.println("remain: "+remain);

        
        
    }
}