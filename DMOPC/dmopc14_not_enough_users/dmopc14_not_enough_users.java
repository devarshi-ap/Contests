//DMOPC '14 Contest 3 P1 - Not Enough Users!

import java.util.Scanner;

public class dmopc14_not_enough_users {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int k = sc.nextInt();
		int d = sc.nextInt();
		int t = n;
		
		for(int i=0; i<d; i++){
		    t *= k;
		}
		
        System.out.println(t);
        
        sc.close();
	}
}
