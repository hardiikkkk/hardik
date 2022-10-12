// to print 1 to 10 but not 7 and 8 ?

public class question {
    public static void main(String args[]){

        
        int i = 1;

        while (i<=10){
            if(i != 7 && i!= 8 )
                System.out.println(i);
            i=i+1;
        }

    }
}