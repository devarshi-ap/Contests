import java.util.Scanner;



public class avalon {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        int g = sc.nextInt();
        double chance = 1;

        for(int i=0; i<g; i++){
            
            int e = sc.nextInt();
            int p = sc.nextInt();

            chance *= (double)(p-e)/p;            
        }

        System.out.printf("%.6f%n", chance);
        sc.close();
    }
}
