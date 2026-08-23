package Pattern_Printing;

import java.util.Scanner;

public class Star_Plus {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the star plus you wanna print : ");
        int side = sc.nextInt();
        int mid=(side/2)+1;
        for(int i=1;i<=side;i++){
            for(int j=1;j<=side;j++){
                if(side%2!=0){
                    if(i==mid || j==mid){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }else{
                    if(i==mid-1 || i==mid || j==mid-1 || j==mid){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }       
                }
            }
            System.out.println();
        }
        sc.close();
    }
}