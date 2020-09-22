import java.util.Scanner;


public class vasile_haircuts {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int l = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int f = sc.nextInt();

            if(f >= (l-b) && f <= (l-a)){
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }

        sc.close();
    }
}
