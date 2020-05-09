//DMOJ - Who is in the Middle?
import java.util.Scanner;

public class WhoIsInTheMiddle
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try{
        
            int w1, w2, w3;
            
            w1 = sc.nextInt();
            w2 = sc.nextInt();
            w3 = sc.nextInt();
            
            if((w1 < 100)&&(w2 < 100)&&(w3 < 100)){
                
                if( ((w1<w2)&&(w1>w3)) || ((w1>w2)&&(w1<w3)) )
                {
                    System.out.println(w1);//w1 is middle bowl
                    
                }
                else if( ((w2<w1)&&(w2>w3)) || ((w2>w1)&&(w2<w3)) )
                {
                    System.out.println(w2);//w2 is middle bowl
                }
                else if( ((w3<w1)&&(w3>w2)) || ((w3>w2)&&(w3<w1)) )
                {
                    System.out.println(w3);//w3 is middle bowl
                }else{
                    System.out.println(w1);
                }
            }
        }
        finally{
            sc.close();
        }
	}
}
