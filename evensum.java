// sum of even no. till n ?

import java.util.Scanner;
public class evensum {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int i = 1;
        int sum = 0;
        int d = 2;

        while(i<=n){
            if(i%2==0){
                sum = sum + i;
            }
            
            i=i+1;
        }
        System.out.println(sum);
    }
}

            
            
            
            
           
            
        
