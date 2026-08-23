/*Print the following pattern using loops:

    A B C D 
    A B C D {A SQUARE BASCICALLY}
    A B C D
    A B C D
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_Square{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter till which you want the Alphabet square(CASE SENSITIVITY):");//Alternate code, even better version.
        char alphasq = sc.next().charAt(0);  //int alphasq = sc.next.Int();
        if(alphasq>='A' && alphasq<='Z'){
            for(int i=65;i<=(int)alphasq;i++){         //for(char i='A';i<=(char)alphasq;i++){
                for(int j=65;j<=(int)alphasq;j++){     //    for(char j='A';j<=(char)alphasq;j++){ 
                    System.out.print((char)j+" ");     //       System.out.print((char)j+" ");
                }                                      //       }
                System.out.println("");
            }
        }else{
            System.out.println("Invalid input! Input only accepted from A to Z.");
        }
        sc.close();
    }
}