//CCC '16 J1 - Tournament Selection

import java.util.Scanner;


public class ccc16j1_tournament_selection
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        int win = 0;
        int loss = 0;
    
        
        for(int i=0; i < 6; i++) {
            char game = sc.next().charAt(0);
        
            if(game == 'W'){
                win++; //win counter
            } else {
                loss++; //loss counter
            }
        }    
    

        if((win == 5)||(win == 6)) {
            System.out.println(1);
        } else if((win == 3)||(win == 4)) {
            System.out.println(2);
        } else if((win == 1)||(win == 2)) {
            System.out.println(3);
        } else{
            System.out.println(-1);
        }
    
        sc.close();
    }
}
