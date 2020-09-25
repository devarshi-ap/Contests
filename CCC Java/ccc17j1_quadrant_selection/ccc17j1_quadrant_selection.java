import java.util.Scanner;

public class QuadrantSelection
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
   
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.printf("\n");


        if((x > 0)&&(y > 0)) {
            System.out.println(1);
            
        } else if((x > 0)&&(y < 0)) {
          System.out.println(4);
          
        } else if((x < 0)&&(y < 0)) {
          System.out.println(3);
          
        } else if((x < 0)&&(y > 0)) {
          System.out.println(2);
          
        } else {
          System.out.println("Origin");
        }
    
    }
}
