package Pattern_Printing;

import java.util.Scanner;

public class Odd_Number_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the odd number triangle : ");
        int row = sc.nextInt();
        for(int i=1;i<=row;i++){
            int odd=1;
            for(int j=1;j<=i;j++){
                System.out.print(odd+" ");
                odd+=2;
            }
            System.out.println();
        }
        sc.close();
    }
}
