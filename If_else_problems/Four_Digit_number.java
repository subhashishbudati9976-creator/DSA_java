//Take input from user and check if a number is a four digit number or not
package If_else_problems;

import java.util.Scanner;

public class Four_Digit_number {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number that comes out of your dirty-ass mind:");
        int num = sc.nextInt();
        if((num>999)&&(num<10000)||(num<-999)&&(num>-10000)){
            System.out.println("The number "+num+" is a four digit number.");
        }else{
            System.out.println("The number "+num+" is not a four digit number.");
        }
        sc.close();
    }
}
