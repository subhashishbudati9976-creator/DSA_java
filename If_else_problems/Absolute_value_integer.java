//To find the absolute value of an integer
package If_else_problems;

import java.util.Scanner;

public class Absolute_value_integer {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer you want the absolute value of:");
        int n = sc.nextInt();
        if(n>=0){
            System.out.println("The absolute value of the integer "+n+" is : "+n);
        }else{
            System.out.println("The absolute value of the integer "+n+" is : "+(-n));
        }
        sc.close();
    }
}