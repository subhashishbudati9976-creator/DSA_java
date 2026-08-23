/*Print the following pattern using loops:

    a a a a
    b b b b{A SQUARE BASCICALLY}
    c c c c 
    d d d d
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Small_Alphabet_Square_2{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter till which you want the Small Alphabet square(CASE SENSITIVITY):");//Alternate code, even better version.
        char salphasq = sc.next().charAt(0);  //int alphasq = sc.next.Int();
        if(salphasq>='a' && salphasq<='z'){
            for(int i=97;i<=(int)salphasq;i++){         //for(char i='a';i<=(char)alphasq;i++){
                for(int j=97;j<=(int)salphasq;j++){     //    for(char j='a';j<=(char)alphasq;j++){ 
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