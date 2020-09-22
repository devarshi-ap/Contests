//3n + 1; uncategorized

import java.util.Scanner;


public class three_n_plus_one 
{
  public static void main(String[] args) {
  
      Scanner sc = new Scanner(System.in);
        

      int num = sc.nextInt();
      int count = 0;
        
            
      while(num > 1)//if number isn't already 1...
      {
          if(num % 2 == 0)//checks if number is positive
          {
              num = num/2;//number is divided by 2
              count++;
          }
          else{//if number isn't even; is odd,
              num = 3*num + 1;//number is multiplied by 3 and added 1 to.
              count++;
          }
      }

      System.out.println(count);
      sc.close();
	  }
} 
