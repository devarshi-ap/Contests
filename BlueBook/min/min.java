//BlueBook - Min

import java.util.Scanner;


public class min {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        double x = sc.nextDouble();
        double min = x;

        for(int i=0; i<n-1; i++){
            x = sc.nextDouble();

            if(x < min){
                min = x;
            }
        }

        System.out.printf("%.2f", min);


        sc.close();
    }
}
