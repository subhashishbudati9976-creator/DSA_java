/*Print the following pattern using loops:

    1 2 3 4 
    1 2 3 4 {A SQUARE BASCICALLY}
    1 2 3 4
    1 2 3 4
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Number_Square{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number square you wanna print:");
        int numsq = sc.nextInt();
        for(int i=1;i<=numsq;i++){
            for(int j=1;j<=numsq;j++){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}