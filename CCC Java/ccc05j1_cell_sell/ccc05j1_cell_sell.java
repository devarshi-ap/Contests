//CCC '05 J1 - The Cell Sell

import java.util.Scanner;


public class ccc05j1_cell_sell{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double daytime = sc.nextInt();
        double evening = sc.nextInt();
        double weekend = sc.nextInt();
        double totalA = 0, totalB = 0;

        if(daytime >= 100){
            totalA += (daytime - 100)*(0.25) + evening*0.15 + weekend*0.2;
        } else {
            totalA += evening*0.15 + weekend*0.2;
        }

        if(daytime >= 250){
            totalB += (daytime - 250)*(0.45) + evening*0.35 + weekend*0.25;
        } else {
            totalB += evening*0.35 + weekend*0.25;
        }

        System.out.printf("Plan A costs %.2f%nPlan B costs %.2f%n", totalA, totalB);
        System.out.println((totalA < totalB) ? "Plan A is cheapest." : (totalB < totalA) ? "Plan B is cheapest." : "Plan A and B are the same price.");
        
        sc.close();
    }

}
