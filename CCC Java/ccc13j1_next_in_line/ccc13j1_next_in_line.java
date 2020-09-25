import java.util.Scanner;

public class ccc13j1_next_in_line
{
  public static void main( String[] args )
  {
    Scanner sc = new Scanner(System.in);
    
    int kid1 = sc.nextInt();
    int kid2 = sc.nextInt();
    
    int kid3 = kid2 + (kid2 - kid1);
    
    System.out.println(kid3);
  
  }

}
