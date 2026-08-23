import java.util.Scanner;

public class IFELSEPROGRAMEXAMPLE{
    public static void main(String[]args){
        //program to check if a number is even or odd
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it is even or odd:");
        int num = sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even dumbass.\n");
        }
        else{
            System.out.println("The number is odd FOOL.\n");
        }
        sc.close();
    }
}