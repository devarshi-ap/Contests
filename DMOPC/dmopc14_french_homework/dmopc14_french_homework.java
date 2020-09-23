//DMOPC '14 Exam Time P1 - French Homework

import java.util.Scanner;


public class dmopc14_french_homework {
    public static void main(String[] args){
      
        Scanner sc = new Scanner(System.in);
        
        String verb = sc.nextLine();
        String noun = sc.nextLine();
        
        if(noun.charAt(noun.length()-1) == 's'){
        System.out.println(verb + "-tu les " + noun + " ?");
        
        } else if(noun.charAt(noun.length()-1) == 'e'){
        System.out.println(verb + "-tu la " + noun + " ?");
        
        }else{
        System.out.println(verb + "-tu le " + noun + " ?");
        }

        sc.close();
    }
}
