package Pattern_Printing;

import java.util.Scanner;

public class Vertically_Flipped_Alphabet_Triangle_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you wanna print the vertically flipped alpphabet triangle : ");
        int vfst = sc.nextInt(); //vfst=Vertically Flipped Star Triangle
        for(int i=1;i<=vfst;i++){
            for(int j=1;j<=vfst-i;j++){
                System.out.print("  ");
            };
            char ch =(char)('A'+i-1);
            for(int a=1;a<=i;a++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}