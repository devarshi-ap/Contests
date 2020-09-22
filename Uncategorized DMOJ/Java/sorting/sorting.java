import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;



public class sorting {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int m = sc.nextInt();
            numbers.add(m);
        }

        Collections.sort(numbers);
        
        for(int x: numbers){
            System.out.println(x);
        }

        sc.close();
    }
}
