package Pattern_Printing;

import java.util.Scanner;

public class Vertically_Flipped_Alphanumeric_Triangle_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you wanna print the vertically flipped alphanumeric triangle : ");
        int vfst = sc.nextInt(); //vfst=Vertically Flipped Star Triangle
        for(int i=1;i<=vfst;i++){
            for(int j=1;j<=vfst-i;j++){
                System.out.print("  ");
            };
            char ch =(char)('A'+i-1);
            if(i%2==0){
                for(int a=1;a<=i;a++){
                    System.out.print(ch+" ");
                }
            }else{
                for(int k=1;k<=i;k++){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}