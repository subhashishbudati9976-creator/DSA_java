package Pattern_Printing;

import java.util.Scanner;

public class Flipped_Alphabet_Triangle_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the horizontally flipped alphabet triangle :");
        int row = sc.nextInt();
        for(int i=row;i>=1;i--){
            char ch = (char)('A'+i-1);
            for(int j=1;j<=i;j++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
