//DMOPC '16 Contest 3 P0 - Negative Feedback

import java.util.Scanner;

public class dmopc17_secrets {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int t = sc.nextInt();
		
		if(Math.sqrt(Math.pow(x1-x3, 2)+Math.pow(y1-y3, 2))<=t || Math.sqrt(Math.pow(x2-x3, 2)+Math.pow(y2-y3, 2))<=t) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
        
        sc.close();
	}
}
