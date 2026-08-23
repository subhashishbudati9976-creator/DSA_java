/*Print the following pattern using loops:

    a a a a
    B B B B{A SQUARE BASCICALLY}
    c c c c 
    D D D D
    
*/

package Pattern_Printing;

import java.util.Scanner;

public class Capital_Small_Alphabet_Square{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the letter till which you want the Capital Small Alphabet square(CASE SENSITIVITY):");//Alternate code, even better version.
        char salphasq = sc.next().charAt(0);                                //int alphasq = sc.next.Int();
        if((salphasq>='a' && salphasq<='z') || (salphasq>='A' && salphasq<='Z')){ //for(char i='a';i<=(char)alphasq;i++){
            for(char i='a';i<=salphasq;i++){                                      //    for(char j='a';j<=(char)alphasq;j++){                           
                for(char j='a';j<=salphasq;j++){                                 //       System.out.print((char)i+" ");
                    if((i-'a')%2==0){                                            //       }
                        System.out.print(Character.toLowerCase(i)+"");
                    }else{                                   
                        System.out.print(Character.toUpperCase(i)+""); 
                    }    
                }                                      
                System.out.println();
            }
        }else{
            System.out.println("Invalid input! Input only accepted from A to Z, or a to z.");
        }
        sc.close();
    }
}