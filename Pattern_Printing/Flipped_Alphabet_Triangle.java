package Pattern_Printing;

import java.util.Scanner;

public class Flipped_Alphabet_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you want in the horizontally flipped alphabet triangle :");
        int row = sc.nextInt();
        for(int i=row;i>=1;i--){
            for(char j='A';j<=('A'+(char)i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
