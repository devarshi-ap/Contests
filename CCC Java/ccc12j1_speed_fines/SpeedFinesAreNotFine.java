import java.util.Scanner;

public class SpeedFinesAreNotFine
{
	public static void main( String[] args )
	{
	Scanner sc = new Scanner(System.in);
	
		try{
			
			int limit = sc.nextInt();
			int speed = sc.nextInt();
			

			if(speed <= limit) {
					System.out.printf("Congratulations, you are within the speed limit!");
			}
			else {

				if((speed - limit) <= 20)
				{
					System.out.printf("You are speeding and your fine is $100.");
				}
				else if( ((speed - limit) <= 30) && ((speed - limit) >= 21) ) {
					System.out.printf("You are speeding and your fine is $270.");
				}
				else {
					System.out.printf("You are speeding and your fine is $500.");
				}
			}
			
		} finally {
			sc.close();
		}
	
	}
}
