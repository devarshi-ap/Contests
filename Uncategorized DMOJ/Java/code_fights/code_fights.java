import java.util.Scanner;
import java.lang.Math;



public class code_fights{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int k = sc.nextInt();

            if( Math.abs(a-k) > 100){
                System.out.println("go away! 3:<");
            } else {
                System.out.println("fite me! >:3");
            }
        }
        
        sc.close();
    }
}
