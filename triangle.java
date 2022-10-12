// to check whetaher the triangle is isosecles , 

import java.util.Scanner;

public class triangle {

    public static void main(String args[]){

        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

         if (a<b+c && b<c+a && c<b+a)
        {
            if (a==b && b==c && c==a)
            {
                System.out.println("its an equilateral triangle");
            }
            else if (a==b || b==c || c==a ) 
            {
                System.out.println("its an isosecles trinagle");
            }
            else 
            {
                
                System.out.println("its an scalene triangle");
            }

        }
        else 
        {
            System.out.println("not a triangle");
        }
            
   
    }
}
