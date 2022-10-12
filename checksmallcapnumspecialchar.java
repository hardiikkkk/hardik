// to check whether a char is small, capital,number ,special char?
import java.util.Scanner;

public class checksmallcapnumspecialchar{
    
    public static void main (String args[]){

        Scanner s = new Scanner(System.in);
        char c = s.next().charAt(0);

        if ( c>='a' && c<='z'){
            System.out.println("small alphabet");
        }
        else if ( c>='A' && c<='Z'){
            System.out.println("capital alphabet");
        }
        else if ( c>='0' && c<='9'){
            System.out.println("numberic");
        }
        else {System.out.println("special character");}
    }}

