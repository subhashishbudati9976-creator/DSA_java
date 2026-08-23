/*Print the following pattern using loops:

    1 1 1 1
    2 2 2 2  {A SQUARE BASCICALLY}
    3 3 3 3
    4 4 4 4
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Number_Square_2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the number square you wanna print:");
        int numsq = sc.nextInt();
        for(int i=1;i<=numsq;i++){
            for(int j=1;j<=numsq;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
        sc.close();
    }
}