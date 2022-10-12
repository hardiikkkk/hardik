// wap to find number of even number ??

import java.util.Scanner;
public class numberofeven{
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i = 1;
        
        
        int store = 0;

        while(i<=n){
            if(i%2==0){
                
                store = 1+store;
            }
            i=i+1;
        }   
        System.out.println(store);
            
            
            
            
            
     }
}  