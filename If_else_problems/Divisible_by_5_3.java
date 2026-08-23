//To check if a number is divisible by 5,3
package If_else_problems;

import java.util.Scanner;

public class Divisible_by_5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is divisible by 5 or 3 or both:");
        int n = sc.nextInt();
        while (n < 0) {
            System.out.println("Enter a non negative number:");
            n = sc.nextInt();
        }
        if (n % 5 == 0 && n % 3 == 0) {
            System.out.println("The number is divisible by both 5 and 3 dumbass.");
        } else if (n % 5 != 0 && n % 3 != 0) {
            System.out.println("The number is not divisible by both 5 and 3 FOOL.");
        } else if (n % 5 == 0 && n % 3 != 0) {
            System.out.println("The number is divisible by 5 but not by 3.");
        } else if (n % 5 != 0 && n % 3 == 0) {
            System.out.println("The number is divisible by 3 but not by 5.");
        }
        sc.close();
    }
}