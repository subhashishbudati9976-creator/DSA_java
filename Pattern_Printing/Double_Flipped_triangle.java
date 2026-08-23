/*Print the following doubly flipped triangle:

    * * * * *
      * * * *
        * * *
          * * 
            *
*/
package Pattern_Printing;

import java.util.Scanner;

public class Double_Flipped_triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you need in the double flipped triangle : ");
        int doubleflip = sc.nextInt();
        for(int i=1;i<=doubleflip;i++){
            for(int k=1;k<=i;k++){
                System.out.print("  ");
            }
            for(int j=1;j<=doubleflip+1-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
