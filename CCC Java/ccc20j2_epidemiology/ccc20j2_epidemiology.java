//CCC '20 J2 - Epidemiology

import java.util.Scanner;


public class ccc20j2_epidemiology {
    public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);

        
        int p = sc.nextInt();   //total infected
        int n = sc.nextInt();   //#infected on day0
        int r = sc.nextInt();   //#infected by one person per day

        int infected = n;
        int infectedLastDay = n;
        int days = 0;

        while(infected <= p){
            days++;
            infected += infectedLastDay*r;
            infectedLastDay *= r;            
        }

        System.out.println(days);
        sc.close();
    }
}
