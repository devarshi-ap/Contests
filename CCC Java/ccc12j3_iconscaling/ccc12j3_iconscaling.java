//CCC '12 J3 - Icon Scaling

import java.util.Scanner;
import java.util.HashMap;


public class ccc12j3_iconscaling{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HashMap<String, String> text = new HashMap<String, String>();

        text.put("CU", "see you");
        text.put(":-)", "I'm happy");
        text.put(":-(", "I'm unhappy");
        text.put(";-)", "wink");
        text.put(":-P", "stick out my tongue");
        text.put("(~.~)", "sleepy");
        text.put("TA", "totally awesome");
        text.put("CCC", "Canadian Computing Competition");
        text.put("CUZ", "because");
        text.put("TY", "thank-you");
        text.put("YW", "you're welcome");
        text.put("TTYL", "talk to you later");

        
        while(true){

            String msg = sc.nextLine();

            if(msg.equals("TTYL")){
                System.out.println(text.get(msg));
                break;

            } else {

                if(text.containsKey(msg)){
                    System.out.println(text.get(msg));
                } else {
                    System.out.println(msg);
                }
            }
            
        }

        sc.close();
    }
}
