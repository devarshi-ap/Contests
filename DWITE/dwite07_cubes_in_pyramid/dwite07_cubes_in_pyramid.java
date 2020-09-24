//DWITE '07 R1 #2 - Cubes in a Pyramid

import java.util.Scanner;

public class dwite07_cubes_in_pyramid {

	public static void main(String[] args) {
	    Scanner sc = new Scanner (System.in);
	    

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = (a*a*b/3);
		
		int x = (int)c;

		if (c%1>=0.5){
		    x++;
		}
			
		if ((c<0.5) && (c>0)){
		    x++;
		}
			
		System.out.println(x);
        
        sc.close();
	}
}
