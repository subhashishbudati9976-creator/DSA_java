//Take integer input and tell if its magnitude is smaller than 69 or not.
package If_else_problems;

import java.util.Scanner;

public class Mag_Less_than_69 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any integer:");
        int mag = sc.nextInt();
        if(mag<69){
            System.out.println("The magnitude of the number is less than 69.");
        }else if(mag>69){
            System.out.println("The magnitude of the number is greater than 69.");
        }else if(mag==69){
            System.out.println("The magnitude of the number is equal to 69.");
        }
        sc.close();
    }
}
