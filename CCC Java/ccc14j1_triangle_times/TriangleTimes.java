//DMOJ - Triangle Times
import java.util.Scanner;
//Enter Angles of Triangle that add up to 180

public class TriangleTimes
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        try{

            int d1 = sc.nextInt();
            int d2 = sc.nextInt();
            int d3 = sc.nextInt();
            
            if((d1==60)&&(d2==60)&&(d3==60))
            {
                System.out.println("Equilateral");//Equalateral
                
            }else if(d1 + d2 + d3 == 180){
                
                if((d1==d2)||(d1==d3)||(d2==d3)){
                    System.out.println("Isosceles");//Isosceles
                    
                }else if((d1!=d2)&&(d1!=d3)&&(d2!=d3)){
                    System.out.println("Scalene");//Scalene
                }
            }
            else
            {
                System.out.println("Error");
            }
        }
        finally{
            sc.close();
        }
	}
}
