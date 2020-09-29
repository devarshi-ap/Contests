//BlueBook - Grades

import java.util.Scanner;


public class grades {
    public static void main (String[] args){

        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();

            if(x>=80 && x<=100){
                System.out.println("A");

            } else if(x>=70 && x<=79){
                System.out.println("B");

            } else if(x>=60 && x<=69){
                System.out.println("C");
                
            } else if(x>=50 && x<=59){
                System.out.println("D");
                
            } else if(x>=0 && x<=49){
                System.out.println("F");
                
            } else {
                System.out.println("X");
            }
        }

        
        sc.close();
    }
}
