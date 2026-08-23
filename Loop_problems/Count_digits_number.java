//Count the number of digits in a number using while loop.
package Loop_problems;

import java.util.Scanner;

public class Count_digits_number {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to count the digits of:");
        int num = sc.nextInt();
        int count=0;
        while(num!=0){
            num/=10;//we are dividing the number by 10 in each iteration because we want to remove the last digit of the number in each iteration.
            count++;
        }
        System.out.println("The number of digits in the number is: "+count);
        sc.close();
     }
}
