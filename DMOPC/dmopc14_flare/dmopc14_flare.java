//DMOPC '14 Contest 8 P1 - Flare

import java.util.Scanner;
import java.lang.Math;



public class dmopc14_flare {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        int v = sc.nextInt();

        System.out.printf("%.6f%n", Math.abs((double)(2*v)/(-9.8)) );
        sc.close();
    }
}
