//DMOPC '14 Contest 6 P1 - Core Drill

import java.util.Scanner;
import java.lang.Math;



public class dmopc14_core_drill {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        int r = sc.nextInt();
        int h = sc.nextInt();

        System.out.printf("%.2f%n", (double)((Math.PI*(r*r)*h)/3) );
        sc.close();
    }
}
