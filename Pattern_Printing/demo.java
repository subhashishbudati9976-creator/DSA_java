package Pattern_Printing;

import java.util.Scanner;

public class demo {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of rows for the bridge : ");
        int side = sc.nextInt();
        for(int i=0;i<=2*side-1;i++){
            for(int j=0;j<=2*side-1;j++){
                int top=i;
                int bottom=j;
                int left=(2*side-1)-j;
                int right=(2*side-1)-i;
                System.out.print(Math.min(Math.min(top, bottom), Math.min(left, right))+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
