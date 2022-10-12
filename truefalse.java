// to check wheather the two numbers are equal or not 

import java.util.Scanner;

public class truefalse {
    
    public static void main(String[] args ){

        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        int j = s.nextInt();

        boolean isEq = (i==j);

        System.out.println(" is equal " + isEq  );
    }
}
    