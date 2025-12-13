/******************************************************************************

A company calculates employee salary using: Basic + HRA + Allowance. 
The program must compute the total salary.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int basic=sc.nextInt();
        int HRA=sc.nextInt();
        int allowance=sc.nextInt();
        int total=basic+HRA+allowance;
        
        System.out.println("total: "+total);
        
        
    }
}
