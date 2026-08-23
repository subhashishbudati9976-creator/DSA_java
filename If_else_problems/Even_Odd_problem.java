//To check if a number is even or odd
package If_else_problems;

import java.util.Scanner;

public class Even_Odd_problem{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even dumbass.");
        }else{
            System.out.println("The number is odd FOOL.");
        }
        sc.close();
    }
}
