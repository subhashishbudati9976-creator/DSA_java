//Program to print a raised to the power b using loop
package Loop_problems;

import java.util.Scanner;

public class a_power_b {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the base number:");
        int a = sc.nextInt();
        System.out.println("Enter the power:");
        int b = sc.nextInt();
        int pow=1;
        for(int i=1;i<=b;i++){
            pow*=a;
        }
        System.out.println("The value of "+a+"^"+b+" is : "+pow);
        sc.close();
    }
}
