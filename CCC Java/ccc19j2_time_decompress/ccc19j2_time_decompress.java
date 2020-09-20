//CCC '19 J2 - Time to Decompress

import java.util.Scanner;


public class ccc19j2_time_decompress {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int l = sc.nextInt();

        for(int i=0; i<l; i++){

            int n = sc.nextInt();
            char c = sc.next().charAt(0);

            for(int g=0; g<n; g++){
                System.out.print(c);
            }

            System.out.println("");
        }

        sc.close();
    }
}
