package Pattern_Printing;

import java.util.Scanner;

public class Vertically_Flipped_Number_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you wanna print the vertically flipped number triangle : ");
        int vfst = sc.nextInt(); //vfst=Vertically Flipped Star Triangle
        for(int i=1;i<=vfst;i++){
            for(int j=1;j<=vfst-i;j++){
                System.out.print("  ");
            }
            int num=1;
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
        sc.close();
    }
}
