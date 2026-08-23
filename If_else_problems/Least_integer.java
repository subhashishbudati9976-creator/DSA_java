//Take 3 positive integers input and print the greatest of them.
package If_else_problems;

import java.util.Scanner;

public class Least_integer {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:"); 
        int num3 = sc.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println(""+num1+" is the least number.");
        }else if(num2<num1 && num2<num3){
            System.out.println(""+num2+" is the least number.");
        }else if(num3<num1 && num3<num2){
            System.out.println(""+num3+" is the least number.");
        }else if((num1==num2) && num1<num3){
            System.out.println("1st "+num1+" and 2nd "+num2+" are the least numbers with equal values.");
        }else if((num2==num3) && num2<num1){
            System.out.println("2nd "+num2+" and 3rd "+num3+" are the least numbers with equal values.");
        }else if((num3==num1) && num3<num2){
            System.out.println("1st "+num3+" and 3rd "+num1+" are the least numbers with equal values.");
        }
        sc.close();
    }
} 
