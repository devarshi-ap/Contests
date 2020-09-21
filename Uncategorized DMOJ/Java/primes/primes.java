//Primes - Uncategorized
//Lists first X primes

import java.util.Scanner;


public class primes {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int x = 2;
        int counter = 0;

        while(counter < n){
            boolean flag = false;
            for(int i = 2; i <= x/2; ++i)
            {
                // condition for nonprime number
                if(x % i == 0)
                {
                    flag = true;
                    break;
                }
            }

            if (!flag){
                System.out.println(x);
                counter++;
            }

            x++;
        }

        sc.close();
    }
}
