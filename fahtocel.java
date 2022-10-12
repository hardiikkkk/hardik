// convert farenhite  to celcius ( coding ninja conditional questions)?

import java.util.Scanner;
public class fahtocel{
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();// start
        int e = scan.nextInt();// final
        int w = scan.nextInt();// gap
        int Start ;
        
        
        while(s<=e){
            
            Start = (5*(s-32))/9;
           
            System.out.println(s+ "  " +Start);

            s=s+w;

        }
    }
}
        
       
        
        
        
            
            
            
           


    