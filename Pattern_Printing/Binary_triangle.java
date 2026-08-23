package Pattern_Printing;

import java.util.Scanner;

public class Binary_triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter till which row you want the Binary triangle to print : ");
        int size = sc.nextInt();
        for(int i=1;i<=size;i++){
            for(int j=1;j<=i;j++){
                if(i>=j){
                    if(i==j || (i+j)%2==0){
                        System.out.print("1 ");
                    }else{
                        System.out.print("0 ");
                    }
                }else if(i<j){
                    System.out.print("  ");
                }   
            }
            System.out.println(); 
        }
        sc.close();
    }
}
//Good boy! You are improving man...
/*You can also use the condition like
    if(i is odd and j is even) sout(1);
    if(i is even and j is odd) sout(0);
    if(i is even and j is even) sout(1);
    if(i is odd and j is odd) sout(1);
This also works with suitable modifications.
*/