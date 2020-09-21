//CCC '00 S1 - Slot Machines

import java.util.Scanner;


public class ccc00s1_slot_machines {
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		
		int jar = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		int val = 0;

		while(jar > 0) {
			if(jar == 0) {
				break;
			}
			
			x++;
			val++;
			jar--;
			
			if(x == 35) {
				jar = jar + 30;
				x = 0;
			}
			if(jar == 0) {
				break;
			}
			
			y++;
			val++;
			jar--;
			
			if(y == 100) {
				jar = jar + 60;
				y = 0;
			}
			
			if(jar == 0) {
				break;
			}
			
			z++;
			val++;
			jar--;
			
			if(z == 10) {
				jar = jar + 9;
				z = 0;
			}	
		}
		
		System.out.printf("Martha plays %d times before going broke.", val);
        	sc.close();
    }
}
