//CCC '04 J1 - Squares

import java.util.Scanner;
import java.lang.Math;


public class ccc04j1_squares {
    public static void main( String[] args ) {  
   
        Scanner sc = new Scanner(System.in);
   
        int num1 = sc.nextInt();
        double sqrt = Math.sqrt(num1);
        
        int num1sqrt = (int)sqrt;
        
        System.out.println("The largest square has side length " + num1sqrt + ".");
        
        sc.close();
    }
}
