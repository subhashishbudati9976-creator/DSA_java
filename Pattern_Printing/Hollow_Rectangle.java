package Pattern_Printing;

import java.util.Scanner;

public class Hollow_Rectangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the hollow rectangle you wanna print : ");
        int len = sc.nextInt();
        System.out.println("Enter the breadth of the hollow rectangle you wanna print : ");
        int brd = sc.nextInt();
            for(int i=1;i<=brd;i++){
                for(int j=1;j<=len;j++){
                    if(i==1 || i==brd || j==1 || j==len){
                        System.out.print("* ");
                    }else{
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        sc.close();
    }
}
