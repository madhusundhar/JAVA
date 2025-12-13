/******************************************************************************

A person deposits money in the bank. Using the formula SI = (P × R × T) / 100, the program computes simple interest.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int P=sc.nextInt();
        int R=sc.nextInt();
        int T=sc.nextInt();
        int SI=(P*R*T)/100;
        
        System.out.println("SI: "+SI);
        
        
    }
}