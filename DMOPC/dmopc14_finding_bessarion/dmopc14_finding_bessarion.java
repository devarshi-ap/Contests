//DMOPC '14 Contest 7 P1 - Finding Bessarion

import java.util.Scanner;
import java.util.ArrayList;


public class dmopc14_finding_bessarion {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        ArrayList<String> stationList = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0; i<=n; i++){
            String station = sc.nextLine();
            stationList.add(station);
        }

        for(String val: stationList){
            if(val.equals("Bessarion")){
                int x = stationList.indexOf("Bessarion");

                try{
                    if( (stationList.get(x-1).equals("Bayview") || stationList.get(x+1).equals("Bayview")) && (stationList.get(x-1).equals("Leslie") || stationList.get(x+1).equals("Leslie"))){
                        System.out.println("Y");
                    } else {
                        System.out.println("N");
                    }
                } catch (IndexOutOfBoundsException e){
                    System.out.println("N");
                }
                
            }
        }


        sc.close();
    }
}
