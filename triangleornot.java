//to check if  its a triangle or not 

import java.util.Scanner;

public class triangleornot {
    
    public static void main(String args[]){

        Scanner s = new Scanner (System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();

        if(a<b+c && b<a+c && c<a+b){
            System.out.println("its a triangle");
        }
        else{
            System.out.println("not a trinagle");
        }
    }}