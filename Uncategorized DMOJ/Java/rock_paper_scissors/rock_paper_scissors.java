//CCCHK '15 J1 - Rock-paper-scissors

import java.util.Scanner;


public class RockPaperScissors{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner xx = new Scanner(System.in);

        final int n = sc.nextInt();
        int alice = 0;
        int bob = 0;

        String a = in.nextLine();
        String[] aliceSequence = a.split(" ");

        String b = xx.nextLine();
        String[] bobSequence = b.split(" ");
        

        for(int i=0; i<n; i++){
            if( (aliceSequence[i].equals("rock")) && (bobSequence[i].equals("rock")) ){
                

            } else if( (aliceSequence[i].equals("rock")) && (bobSequence[i].equals("paper")) ){
                bob++;

            } else if( (aliceSequence[i].equals("rock")) && (bobSequence[i].equals("scissors")) ){
                alice++;

            } else if( (aliceSequence[i].equals("paper")) && (bobSequence[i].equals("rock")) ){
                alice++;

            } else if( (aliceSequence[i].equals("paper")) && (bobSequence[i].equals("paper")) ){

            } else if( (aliceSequence[i].equals("paper")) && (bobSequence[i].equals("scissors")) ){
                bob++;

            } else if( (aliceSequence[i].equals("scissors")) && (bobSequence[i].equals("rock")) ){
                bob++;

            } else if( (aliceSequence[i].equals("scissors")) && (bobSequence[i].equals("paper")) ){
                alice++;

            } else if( (aliceSequence[i].equals("scissors")) && (bobSequence[i].equals("scissors")) ){
            }
        }

        System.out.printf("%d %d%n", alice, bob);
        sc.close();
        in.close();
        xx.close();
    }
}
