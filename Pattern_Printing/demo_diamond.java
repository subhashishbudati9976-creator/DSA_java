package Pattern_Printing;

import java.util.Scanner;

public class demo_diamond{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side of the star plus : ");
        int side = sc.nextInt();
        for(int i=1;i<=side;i++){
            for(int j=1;j<=side-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<=i-1;j++){
                System.out.print("* ");
            }
            System.out.println();           
        }
        for(int s=1;s<=side-1;s++){
            for(int j=1;j<=s;j++){
                System.out.print("  ");
            }
            for(int j=side-1;j>=s;j--){
                System.out.print("* ");
            }
            for(int j=side-2;j>=s;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}