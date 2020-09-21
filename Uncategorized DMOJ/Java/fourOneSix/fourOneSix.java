import java.util.Scanner;


public class fourOneSix{
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);


        String number = sc.nextLine();
        String[] hold = number.split(" ");

        String areaCode = hold[0];
        String local = hold[1];

        
        if((areaCode.equals("416")) && (local.length() == 7)){
            System.out.println("valuable");

        } else if((areaCode.equals("647") || areaCode.equals("437")) && (local.length() == 7)){
            System.out.println("valueless");

        } else if( (areaCode.length() != 3) || (areaCode != "416" || areaCode != "437" || areaCode != "647") || (local.length() != 7) ){
            System.out.println("invalid");
        }

        sc.close();
    }
}
