//CCC '01 J1 - Dressing Up

import java.util.Scanner;

public class ccc01j1_dressing {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a=0, b=0;

        for ( a=1; a<=h; a+=2) {

            for ( b=0; b<a; b++) {
                System.out.print("*");
            }
            for ( b=2*a; b<2*h; b++) {
                System.out.print(" ");
            }
            for ( b=0; b<a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for ( a=h-2; a>0; a-=2){

            for ( b=0; b<a; b++) {
                System.out.print("*");
            }
            for ( b=2*a; b<2*h; b++){
                System.out.print(" ");
            }
            for ( b=0; b<a; b++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
