//CCC '10 J1 - What is n, Daddy?


import java.util.Scanner;


public class ccc10j1_what_is_n_daddy {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int n = 0;
        
        for(int i = 0; i <= 5; i++){
            
            for(int j = 0; j <= i; j++){
              
                if(i+j==a){
                    n++;
                }
            }
        }
        
        System.out.println(n);
        sc.close();
    }
}
