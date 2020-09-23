//DMOPC '16 Contest 3 P0 - Negative Feedback

import java.util.Scanner;


public class dmopc15_negative_feedback {
    public static void main (String[] args){
                
        Scanner sc = new Scanner(System.in);
        
        double vin = sc.nextInt();
        double r1 = sc.nextInt();
        double rg = sc.nextInt();

        System.out.println( vin*(1+(r1/rg)) );
        sc.close();
    }
}
