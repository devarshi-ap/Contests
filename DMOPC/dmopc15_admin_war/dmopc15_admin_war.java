//DMOPC '15 Contest 2 P2 - Admin War

import java.util.Scanner;


public class dmopc15_admin_war {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        int xyene = 0;
        int fatalEagle = 0;


        int xSeq[] = new int[n];
        for(int i=0;i<n;i++) {
               xSeq[i] = sc.nextInt();
        }

        int fSeq[] = new int[n];
        for(int i=0;i<n;i++) {
               fSeq[i] = sc.nextInt();
        }

       
        for(int i=0; i<n; i++){
            if(xSeq[i] > fSeq[i]){
                xyene++;
            } else if (fSeq[i] > xSeq[i]){
                fatalEagle++;
            }
        }

        System.out.printf("%d %d%n", xyene, fatalEagle);
        System.out.println((xyene > fatalEagle) ? "Xyene" : (xyene < fatalEagle) ? "FatalEagle" : "Tie");

        sc.close();
    }
}
