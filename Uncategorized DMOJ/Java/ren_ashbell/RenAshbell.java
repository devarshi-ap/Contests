//DMOJ - Ren Ashbell
import java.util.Scanner;

public class RenAshbell
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        
        try{

            int ren, person, count = 0;
            int n = sc.nextInt();//num ppl
            
            if((n >= 2)&&(n <= 10))
            {
                ren = sc.nextInt();//ren's power
                
                if(ren < 10000)
                {
                    for(int i = 0; i < n-1; i++)
                    {
                        person = sc.nextInt();
                        
                        if(ren > person)
                        {
                            count++;
                        }
                        
                    }
                    
                    if(count >= (n-1)){
                        System.out.println("YES");
                    }else{
                        System.out.println("NO");
                    }
                }
            }
        }
        finally{
            sc.close();
        }
	}
}