package Java_Methods;

import java.util.Scanner;

public class Max_of_3_numbers_BuiltIn {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("The max of these three numbers is : "+Math.max(Math.max(a,b),c));
        sc.close();
    }
}
