//Write a program to calculate profit or loss on a product. Take cost price and selling price as input from the user.
package If_else_problems;

import java.util.Scanner;

public class Profit_Loss {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost price of the product:");
        double cp = sc.nextDouble();
        System.out.println("Enter the selling price of the product:");
        double sp = sc.nextDouble();
        if(sp>cp){
            System.out.println("The seller made a profit of "+(sp-cp)+"Rs respectively.");
        }else if(sp<cp){
            System.out.println("The seller experienced a loss of "+(cp-sp)+"Rs respectively.");
        }else if(sp==cp){
            System.out.println("The seller had neither profit nor loss.");
        }
        sc.close();
        }
    }