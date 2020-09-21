//TLE '16 Contest 8 P2 - Dank Meme

import java.util.Scanner;



public class dank_meme {
    public static void main (String[] args){
                
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            String binX = Integer.toBinaryString(x);
            String[] parts = binX.split("");
            

            for(int g=0; g<parts.length; g++){
                
                if(g == parts.length - 1){
                    if(parts[g].equals("1")){
                        System.out.println("dank");
                        break;
                    } else {
                        System.out.println("meme");
                        break;
                    }
                }

                if(parts[g].equals("1")){
                    System.out.print("dank ");
                } else {
                    System.out.print("meme ");
                }
            }
        }        
        
        sc.close();
    }
}
