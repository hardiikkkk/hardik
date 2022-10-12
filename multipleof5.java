// wap to print all number from 1 to 100 divide by 5?

import java.util.Scanner;
public class multipleof5{
    
    public static void main(String args[]){
        int i = 1;
        int z = 100;

        while(i<=z){
            if(i%5==0){
                System.out.println(i);
            }
            i=i+1;
        }

    }
}
