// CCC '00 J1 - Calendar

import java.util.Scanner;


public class ccc00j1_calendar {
    public static void main (String[] args){
    	Scanner sc = new Scanner(System.in);

        int dayWeek = sc.nextInt();
        int daysMonth = sc.nextInt();

        System.out.println("Sun Mon Tue Wed Thr Fri Sat");
                         
        //spacing for the first number corresponding to its day of the week
        for(int i = (4*(dayWeek - 1))+2; i>2; i--){
            System.out.print(" ");
        }

        for(int i=1; i<=daysMonth; i++, dayWeek++) {
            
            if(dayWeek == 8) {
                System.out.println();
                dayWeek = 1;
            }

            if(i<=9) {
                System.out.print("  " + i);
            } else {
                System.out.print(" "+i);
            }

            System.out.print(" ");
        }

        sc.close();
    }
}
