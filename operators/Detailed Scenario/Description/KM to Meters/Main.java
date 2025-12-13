/******************************************************************************

A fitness trainer tracks running distances in meters. Athletes give distance in kilometers, 
so the program converts km → meters.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int km=sc.nextInt();
        int m=km*1000;
        
        System.out.println("meters: "+m);
        
        
    }
}