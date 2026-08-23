package Pattern_Printing;

import java.util.Scanner;

public class Simple_Number_Loop {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number through which you want the number spiral loop : ");
        int loop = sc.nextInt();
        for(int i=1;i<=loop;i++){
            for(int j=1;j<=loop;j++){
                System.out.print(Math.min(i,j)+" ");//minimum of two numbers will be printed for loops
            }
            System.out.println();
        }
        sc.close();
    }
}