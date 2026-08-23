/*Print the following code:

    1
    A B
    1 2 3
    A B C D
    1 2 3 4 5
    A B C D E F
*/

package Pattern_Printing;

import java.util.Scanner;

public class Alphanumeric_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for the alphanumeric triangle :");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            if(i%2==0){
                for(int j=0;j<i;j++){
                    System.out.print((char)('A'+j)+" ");
                }
            }else{
                for(int j=1;j<=i;j++){
                    System.out.print(j+" ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
