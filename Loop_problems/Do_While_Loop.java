//Basic program to print numbers from 1 to 10 using do-while loop for understanding the basic syntax of do-while loop.
package Loop_problems;

public class Do_While_Loop {
    public static void main(String[] args){
        int i=1;
        do{
            System.out.println(""+i);
            i++;
        }while(i<=10);
    }
}
/* The do-while loop is similar to while loop but it executes the body of the loop at least once before checking the condition. */
/*Example of infinite loops:

 (1)   for(int i=1;i<=10;i--)*{
        System.out.println(""+i);
    }
        
  (2)  while(i<=10){
        System.out.println(""+i);
        i--;
    }
*/
/*In the above examples, the value of i is decreasing in each iteration, so it will never reach 10 and the loop will run indefinitely. */