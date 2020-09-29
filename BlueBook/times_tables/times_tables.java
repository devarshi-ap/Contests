//BlueBook - Times Tables

import java.util.Scanner;


public class times_tables {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            System.out.printf("%d X %d = %d%n", n, i, (n*i));
        }

        sc.close();
    }
}
