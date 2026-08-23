/*Print the following pattern using loops:

    A A A A 
    B B B B {A SQUARE BASCICALLY}
    C C C C
    D D D D
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_Square_2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter till which you want the Alphabet square(CASE SENSITIVITY):");//Alternate code, even better version.
        char alphasq = sc.next().charAt(0);  //int alphasq = sc.next.Int();
        if(alphasq>='A' && alphasq<='Z'){
            for(int i=65;i<=(int)alphasq;i++){         //for(char i='A';i<=(char)alphasq;i++){
                for(int j=65;j<=(int)alphasq;j++){     //    for(char j='A';j<=(char)alphasq;j++){ 
                    System.out.print((char)i+" ");     //       System.out.print((char)i+" ");
                }                                      //       }
                System.out.println("");
            }
        }else{
            System.out.println("Invalid input! Input only accepted from A to Z.");
        }
        sc.close();
    }
}