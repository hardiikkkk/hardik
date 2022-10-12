// to check if the given char is vowels , number or a special chartacter 

import java.util.Scanner;
       
     public class vowels {
        
        public static void main(String args[]){
            
            Scanner s = new Scanner(System.in);
            
            char c = s.next().charAt(0);
            
            if (c == 'a'|| c== 'i'||c== 'o'|| c=='e'|| c== 'u'){
                System.out.println("vowels");
            }
            else if ( c>=' 0' && c<= '9'){
                System.out.println("number");
            }
            else{System.out.println("special character");}
        }} 