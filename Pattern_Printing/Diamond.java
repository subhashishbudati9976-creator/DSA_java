package Pattern_Printing;

import java.util.Scanner;

public class Diamond {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of base lines you want in the diamond :");
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
        for (int k=line-1;k>=1;k--) {
            for (int s=1;s<=line-k;s++) {
                System.out.print("  ");
            }
            int diamond = 2*k-1;
            for (int j=1;j<=diamond;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
        # # # # #. * 
        # # # #. * * *
        # # #. * * * * *
        # #. * * * * * * *
        #. * * * * * * * * *         "#"->Blank Spaces FOOLLLLL!
        #.   * * * * * * *
        # #.   * * * * *
        # # #.   * * *
        # # # #.   *    
*/