//CCC '20 J1 - Dog Treats


import java.util.Scanner;


public class ccc20j1_dogtreats {
    public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        int m = sc.nextInt();
        int l = sc.nextInt();        

        if((s + 2*m + 3*l)>=10){
            System.out.println("happy");
        } else {
            System.out.println("sad");
        }
        
        sc.close();
    }
}
