/******************************************************************************

A person drives at a constant speed. Given the speed (km/hr) and time (hr), 
the program must calculate the distance travelled using: distance = speed × time.

*******************************************************************************/
import java.util.*;

class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        int speed=sc.nextInt();
        int time=sc.nextInt();
        
        double distance=speed*time;
        
        System.out.println("distance travelled: "+distance);
        
        
    }
}
