//Take an integer input and print whether it is even or odd using the ternary operator.
package If_else_problems;

import java.util.Scanner;

public class TERENARY_OPERATOR_EvenOdd {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int num = sc.nextInt();
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println(num+" is an "+result+" number.");
        sc.close();
    }
}
