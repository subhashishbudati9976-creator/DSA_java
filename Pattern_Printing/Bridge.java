package Pattern_Printing;

import java.util.Scanner;

public class Bridge {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want the bridge to be constructed : ");
        int row = sc.nextInt();
        for(int a=1;a<=2*row-1;a++){
            System.out.print("* ");
        }
        System.out.println();
        for(int i=1;i<=row-1;i++){
            for(int j=1;j<=row-i;j++){
                System.out.print("* ");
            }
            int pyramid=2*i-1;
            for(int k=1;k<=pyramid;k++){
                System.out.print("  ");
            }
            for(int l=1;l<=row-i;l++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
//nani is playing and i am just typing shit for timepass, i am currentky travelling in the pushpak bus