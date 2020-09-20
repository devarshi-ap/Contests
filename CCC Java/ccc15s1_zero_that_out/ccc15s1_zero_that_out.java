//CCC '15 S1 - Zero That Out

import java.util.Scanner;
import java.util.Stack;


public class ccc15s1_zero_that_out {
    public static void main(String[] args) {

        Stack<Integer> n = new Stack<Integer>();
        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        
        for(int i=0; i<a; i++){
            int b = sc.nextInt();
            
            if(b == 0){
                n.pop();
                continue;
            }
            
            n.add(b);
        }

        int sum = 0;

        while(n.size() > 0){
            sum += n.pop();
        }

        System.out.println(sum);
        sc.close();
    }
}
