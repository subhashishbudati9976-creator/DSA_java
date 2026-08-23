//Print the sum of digits in a number using while loop.
package Loop_problems;

import java.util.Scanner;

public class Sum_digits_number {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to count the digits of:");
        int num = sc.nextInt();
        int sum=0;
        while(num!=0){
            int digit=num%10;//we are getting the last digit of the number by taking the modulus of the number with 10.
            num/=10;//we are dividing the number by 10 in each iteration because we want to remove the last digit of the number in each iteration.
            sum+=digit;//we are adding the last digit of the number to the sum variable in each iteration.
        }
        System.out.println("The sum of digits in the number is: "+sum);
        sc.close();
     }
}
