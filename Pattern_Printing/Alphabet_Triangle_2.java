package Pattern_Printing;

import java.util.Scanner;

public class Alphabet_Triangle_2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which letter you want the alphabet triangle :");
        char line = sc.next().charAt(0);
        if(line>='A' && line<='Z'){
            for(char i='A';i<=line;i++){
                for(char j='A';j<=i;j++){
                    System.out.print(i+" ");
                }
            System.out.println();
            }
        }else{
            System.out.println("Invalid input, input only accepted from A to Z.");
        }
        sc.close();
    }
}
