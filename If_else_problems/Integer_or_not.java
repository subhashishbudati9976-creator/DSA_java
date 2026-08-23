//Take real no input and check if it is an integer or not.
package If_else_problems;

import java.util.Scanner;

public class Integer_or_not {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an integer:");
        double num = sc.nextDouble();
        int x = (int)num;//Typecasting(converting one data type to another, from double to int)
        if(x == num){
            System.out.println("The number is an integer.");
        }else{
            System.out.println("The number is not an integer.");
        }
        sc.close();
    }
}
