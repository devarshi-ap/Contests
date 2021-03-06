//DMOJ - Canadian Calorie Counting
import java.util.Scanner;

public class CalorieCounting
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        try{
            int burger = sc.nextInt();
            int side = sc.nextInt();
            int drink = sc.nextInt();
            int dessert = sc.nextInt();
            int totalCal = 0;

            switch (burger) {
                case 1:
                    totalCal += 461;
                    break;
                case 2:
                    totalCal += 431;
                    break;
                case 3:
                    totalCal += 420;
                    break;
                case 4:
                    totalCal += 0; 
                    break;
            }
            
            switch (side) {
                case 1:
                    totalCal += 100;
                    break;
                case 2:
                    totalCal += 57;
                    break;
                case 3:
                    totalCal += 70;
                    break; 
                case 4:
                    totalCal += 0; 
                    break;
            }

            switch (drink) {
                case 1:
                    totalCal += 130;
                    break;
                case 2:
                    totalCal += 160; 
                    break;
                case 3:
                    totalCal += 118; 
                    break;
                case 4:
                    totalCal += 0; 
                    break;
            }

            switch (dessert) {
                case 1:
                    totalCal += 167;
                    break;
                case 2:
                    totalCal += 266; 
                    break;
                case 3:
                    totalCal += 75; 
                    break;
                case 4:
                    totalCal += 0; 
                    break;
            }

            System.out.println("Your total Calorie count is " + totalCal + ".");
        }
        finally{
            sc.close();
        }
	}
}