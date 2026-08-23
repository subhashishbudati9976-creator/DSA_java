package Pattern_Printing;

import java.util.Scanner;

public class Star_Number_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of lines you want in the triangle :");
        int line = sc.nextInt();
        for(int i=1;i<=line;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
