package Loop_problems;

import java.util.Scanner;

public class demo_practise_file {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = 0;
        int sum = 0;
        while (n != 0) {
            int digit= n % 10;
            sum+=digit;
            n /= 10;
            count++;
        }
        System.out.println("The number has " + count + " digits.");
        System.out.println("The sum of digits is : " + sum);
        sc.close(); 
    }
}
