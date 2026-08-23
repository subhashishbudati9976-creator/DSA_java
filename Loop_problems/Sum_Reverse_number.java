//Code to generate the reverse of the number that is taken from the user as input
package Loop_problems;

import java.util.Scanner;

public class Sum_Reverse_number{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the reverse and sum of :");
        int num = sc.nextInt();
        int reverse=0;
        int sum=0;
        while(num!=0){
            int digit = num%10;
            reverse=reverse*10+digit;
            num/=10;
            sum+=digit;
        }
        System.out.println("The reversed number is "+reverse+" and the sum of the digits is : "+sum+" and seriously Fuck you nigga!");
        sc.close();
    }
}