// CCC '01 S1 - Keeping Score
// simplify

import java.io.*;
import java.util.*;

public class Main {
 
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        
        String input = in.next();
        String clubs = "";
        String diamonds = "";
        String hearts = "";
        String spades = "";
        String temp = "";
        
        int clubLoc = 0, diamondLoc = 0, heartLoc = 0, spadeLoc = 0;
        int cp = 0, dp = 0, hp = 0, sp = 0, pAdded = 0;
        
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == 'C'){
                clubLoc = i;
                
            }else if(input.charAt(i) == 'D'){
                diamondLoc = i;
                
            } else if(input.charAt(i) == 'H'){
               
                heartLoc = i;
            } else if(input.charAt(i) == 'S'){
                spadeLoc = i;
                
            }
        }
         
                for(int f = 0; f < diamondLoc - clubLoc - 1; f++){
                    temp = Character.toString(input.charAt(f + clubLoc + 1)) + " ";
                  
                    if(!temp.equals("C") && !temp.equals("D") && !temp.equals("H") && !temp.equals("S")){
                       clubs += temp; 
                       cp += pointDet(temp);
                    }
                }
                    
                    for(int f = 0; f < heartLoc - diamondLoc - 1; f++){
                        
                        temp = Character.toString(input.charAt(f + diamondLoc + 1)) + " ";
                  
                        if(!temp.equals("C") && !temp.equals("D") && !temp.equals("H") && !temp.equals("S")){
                            dp += pointDet(temp);
                            diamonds += temp;
                        }
                 
                }
                  
                    for(int f = 0; f < spadeLoc - heartLoc - 1; f++){
                    
                        temp = Character.toString(input.charAt(f + heartLoc + 1)) + " ";
                        if(!temp.equals("C") && !temp.equals("D") && !temp.equals("H") && !temp.equals("S")){
                            hp += pointDet(temp);
                     hearts += temp;
                        }
                }
                    
                    for(int f = 0; f < input.length() - spadeLoc - 1; f++){
                       
                        temp = Character.toString(input.charAt(f + spadeLoc + 1)) + " ";
                        if(!temp.equals("C") && !temp.equals("D") && !temp.equals("H") && !temp.equals("S")){
                            spades += temp;
                            sp += pointDet(temp);
                            
                        }
           
                }
                    
                    
       cp += VSD(clubs);
       dp += VSD(diamonds);
       hp += VSD(hearts);
       sp += VSD(spades);
                    
        System.out.println("Cards Dealt\t\tPoints");
        System.out.println("Clubs " + clubs + "\t\t" + cp);
        System.out.println("Diamonds " + diamonds + "\t\t" + dp);
        System.out.println("Hearts " + hearts + "\t\t" + hp);
        System.out.println("Spades " + spades + "\t\t" + sp);
        System.out.println("\tTotal " + String.valueOf(cp + dp + hp + sp));
    
        }
       
        
        public static int pointDet(String input){
            char val = input.charAt(0);
            
            switch(val){
                
                case 'A':
                    return 4;
                case 'K':
                    return 3;
                case 'Q':
                    return 2;
                case 'J':
                    return 1;
            }
         return 0;
        }
        
        public static int VSD(String input){
            
            input = input.replaceAll("\\s", "");
            
            switch(input.length()){
                case 0:
                    return 3;
                case 1:
                    return 2;
                case 2:
                    return 1;
            }
            return 0;
        }
        
  
    
}
