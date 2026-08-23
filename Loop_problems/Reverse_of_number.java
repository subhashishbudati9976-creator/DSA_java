//Code to generate the reverse of the number that is taken from the user as input
package Loop_problems;

import java.util.Scanner;

public class Reverse_of_number{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want the reverse of :");
        int num = sc.nextInt();
        int reverse=0;
        while(num!=0){
            int digit = num%10;
            reverse=reverse*10+digit;
            num/=10;
        }
        System.out.println("The reversed number is "+reverse);
        sc.close();
    }
}
/*The logic behind this code is that if the number is 123, then 1234%10=3, 3 is stored in the digit variable. Now, initially the value of reverse variable
is 0. The reverse variable is multiplied by 10 and and the value of digit variable is added. So, reverse=0*10+4=4. Now the last number of the the given input
is removed by num=num/10. so the new number is 123. Again the same process is repeated. So, 123%10=3. Stored in digit. Reverse= 4*10 + 3=43. So, 123/10=12. So,
12%10=2, reverse=43*10+2=432. 12/10=1. 1%10=1. reverse=432*10=1=4321 which is the required reverse of the number.*/