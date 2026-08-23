package Java_Methods;

import java.util.Scanner;

public class Max_of_4_numbers_BuiltIn {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("The max of these three numbers is : "+Math.max(Math.max(Math.max(a,b),c),d));
        sc.close();
    }
}
