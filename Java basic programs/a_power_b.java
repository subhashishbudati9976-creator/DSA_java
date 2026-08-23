//Program to print a raised to the power b shortcut


import java.util.Scanner;

public class a_power_b {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the base :");
        int a = sc.nextInt();
        System.out.println("Enter the value of the power :");
        int b = sc.nextInt();
        int c = (int)Math.pow(a, b);
        System.out.println("The value of "+a+"^"+b+" is "+c);
        sc.close();
    }
}
