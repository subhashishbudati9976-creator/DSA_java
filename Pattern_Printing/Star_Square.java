/*Print the following pattern using loops:

    * * * *
    * * * *  {A SQUARE BASCICALLY}
    * * * *
    * * * *
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Star_Square{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square you wanna print:");
        int a = sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int j=1;j<=a;j++){
                System.out.print("*  ");
            }
            System.out.println("");
        }
        sc.close();
    }
}