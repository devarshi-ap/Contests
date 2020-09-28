//BlueBook - Cross Country

import java.util.Scanner;
import java.util.HashMap;


public class cross_country {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> code = new HashMap<>();

        code.put("MG", "midget girls");
        code.put("MB", "midget boys");
        code.put("JG", "junior girls");
        code.put("JB", "junior boys");
        code.put("SG", "senior girls");
        code.put("SB", "senior boys");

        String x = sc.nextLine();

        if(code.containsKey(x)){
            System.out.println(code.get(x));
        } else {
            System.out.println("invalid code");
        }


        sc.close();
    }
}
