//CCC '08 S1 - It's Cold Here!


import java.util.Scanner;


public class ccc08s1_its_cold_here{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int coldestTemp = 0;
        String coldestCity = "";

        while(true){
            String userIn = sc.nextLine();
            
            String cityTemp[] = userIn.split(" ");
            String city = cityTemp[0];
            int temp = Integer.valueOf(cityTemp[1]);
            
            if(temp < coldestTemp){
                coldestTemp = temp;
                coldestCity = city;
            }

            if(city.equals("Waterloo")){
                break;
            }
            
        }
        System.out.println(coldestCity);
        sc.close();
    }
}
