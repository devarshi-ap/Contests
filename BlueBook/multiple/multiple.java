//BlueBook - Multiple

import java.util.Scanner;


public class multiple {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%b==0){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
        
        sc.close();
    }
}
