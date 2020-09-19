//CCC '02 S2 - Fraction Action

import java.util.Scanner;

public class ccc02s2_fraction_action {
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int den = sc.nextInt();

        if (num == 0){
            System.out.println("0");

        } else {
            int whole = num / den;

            if (whole > 0){
                System.out.print(whole);
            }
            int remain = num % den;

            if (remain > 0){
                int gcd = GCD(num, den);
                //System.out.print(" " + remain / gcd + "/" + den / gcd);
                System.out.printf(" %d/%d", remain/gcd, den/gcd);
            }

            System.out.println();
        }
    }

    public static int GCD(int a, int b) {
            if (b == 0){
                return a;
            } 
            return GCD(b, a % b);
    }

}
