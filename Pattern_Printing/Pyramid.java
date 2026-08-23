package Pattern_Printing;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines you want in the pyramid :");
        int line = sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int a=1;a<=line-i;a++){
                System.out.print("  ");
            }
            int stars=2*i-1;
            for(int j=1;j<=stars;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
