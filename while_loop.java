// to check number prime or not ?

import java.util.Scanner;
public class while_loop{
    public static void main(String args[]){

        Scanner s = new Scanner (System.in);
        int i = s.nextInt();
        int d = 2;

        while ( d < i ){
            if(i%d==0){
                System.out.println("not prime");
                return;
            }
            d=d+1;
        }
        System.out.println("its a prime number");
}
}
