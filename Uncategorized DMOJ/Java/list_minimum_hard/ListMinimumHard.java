import java.util.Arrays;
import java.util.Scanner;

public class ListMinimumHard {
	public static void main(String[]args){
		Scanner input  = new Scanner(System.in);
		
		try{
			
			int [] array = new int [input.nextInt()];
			for(int index = 0 ; index < array.length; index++){
				array[index] = input.nextInt();
			}
			Arrays.sort(array);
			for(int index = 0 ; index < array.length; index++){
				System.out.println(array[index]);
			}

		} finally{
			input.close();
		}

	}
}