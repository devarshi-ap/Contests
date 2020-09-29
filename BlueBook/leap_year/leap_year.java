//BlueBook - Leap Year

import java.util.Scanner;


public class leap_year {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){

            int x = sc.nextInt();

            if((x%4==0 && x%100>1) || (x%400==0) || (x==0)){
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        }


        sc.close();
    }
}
