//DMPG '16 B1 - BFS


import java.util.Scanner;


public class dmpg16b1_bfs {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int d = sc.nextInt();
        int q = sc.nextInt();
        int l = sc.nextInt();
        int t = sc.nextInt();

        System.out.println((n*5) + (d*10) + (q*25) + (l*100) + (t*200));
        sc.close();
    }
}
