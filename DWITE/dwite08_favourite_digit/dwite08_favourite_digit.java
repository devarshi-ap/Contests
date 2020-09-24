//DWITE '08 R2 #2 - My favourite digit

import java.util.Scanner;
import java.lang.Math;



public class dwite08_favourite_digit {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<5; i++){
            int n = sc.nextInt();

            Digits(n);
        }
        
        sc.close();
    }

    public static void Digits(int x){
        int largest = 0; 
    
        while(x != 0)  
        { 
            int r = x % 10; 
    
            // Find the largest digit 
            largest = Math.max(r, largest); 
    
            x = x / 10; 
        } 
        System.out.println(largest); 
    }

}
