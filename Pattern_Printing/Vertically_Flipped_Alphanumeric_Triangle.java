package Pattern_Printing;

import java.util.Scanner;

public class Vertically_Flipped_Alphanumeric_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you wanna print the vertically flipped alphanumeric triangle : ");
        int vfst = sc.nextInt(); //vfst=Vertically Flipped Star Triangle
        for(int i=1;i<=vfst;i++){
            for(int j=1;j<=vfst-i;j++){
                System.out.print("  ");
            };
            int num=1;
            char alpha='A';
            if(i%2==0){
                for(int a='A';a<='A'+(char)i-1;a++){
                    System.out.print(alpha+" ");
                    alpha++;
                }
            }else{
                for(int k=1;k<=i;k++){
                    System.out.print(num+" ");
                    num++;
                }
            }
            System.out.println();
        }
        sc.close();
    }
}