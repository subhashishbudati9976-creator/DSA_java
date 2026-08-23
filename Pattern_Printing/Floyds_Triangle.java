package Pattern_Printing;

import java.util.Scanner;

public class Floyds_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which row you want the Floyd's triangle to print : ");
        int size = sc.nextInt();
        int x=1;
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                System.out.print(x+" ");
                x++;
            }
            System.out.println();    
        }
        sc.close();
    }
}