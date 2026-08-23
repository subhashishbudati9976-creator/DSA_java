package Pattern_Printing;

import java.util.Scanner;

public class Hollow_Star_Cross {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the star cross you want to print : ");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=size;j++){
                if(i==j || i+j==size+1){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    sc.close();
    }
}