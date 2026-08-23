/*Print the following pattern:
                 (3)(2)(1)
          1 2 3 4 5 6 7
          
          | | | | | | |

    1  -  1 1 1 1 1 1 1 
    2  -  1 2 2 2 2 2 1
    3  -  1 2 3 3 3 2 1
    4  -  1 2 3 4 3 2 1
 (3)5  -  1 2 3 3 3 2 1
 (2)6  -  1 2 2 2 2 2 1
 (1)7  -  1 1 1 1 1 1 1
 
    Since the coulmns 5,6 and 7 are same as the columns 3,2 and 1, therefore we can write the same code 
    to print the content of columns 1,2 and 3 to columns 5,6 and 7.

    Similarly,Since the rows 5,6 and 7 are same as the rows 3,2 and 1, therefore we can write the same code 
    to print the content of rows 1,2 and 3 to rows 5,6 and 7.
 
    As a result, we take two variables, and write the condition if(a>n) a=2*n-i; which shows that the content of 3,2,1
    printed for 5,6,7 respectively for both rows and columns.
*/
package Pattern_Printing;

import java.util.Scanner;

public class Complex_Number_Spiral {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number through which you want the number spiral loop : ");
        int loop = sc.nextInt();
        for(int i=1;i<=2*loop-1;i++){
            for(int j=1;j<=2*loop-1;j++){
                int a=i, b=j;
                if(a>loop){
                    a=2*loop-i;
                }
                if(b>loop){
                    b=2*loop-j;
                }
                System.out.print(Math.min(a,b)+" ");//minimum of two numbers will be printed for loops
            }
            System.out.println();
        }
        sc.close();
    }
}
/*CONCEPT OF FAKE VALUES(V.V.IMP)
 */