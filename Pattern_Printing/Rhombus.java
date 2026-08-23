package Pattern_Printing;

import java.util.Scanner;

public class Rhombus{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for which you wanna print the rhombus : ");
        int rhom = sc.nextInt(); //vfst=Vertically Flipped Star Triangle
        for(int i=1;i<=rhom;i++){
            for(int j=1;j<=rhom-i;j++){
                System.out.print("  ");
            }
            for(int a=1;a<=rhom;a++){
                System.out.print("* ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*Rhombus is nothing but combining one horzontally flipped blank spaced triangle, 1 input same sized square, and
  1 normal black spaced triangle that will eventally adjust it self to vertically flipped triangle. Imagine!!*/