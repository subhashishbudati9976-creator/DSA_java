//Take n as input and print the sequence 1,n,2,n-1,3,n-2... and so on.

package Loop_problems;

import java.util.Scanner;

public class Print_sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i = 1;
        int j = n;
        while (i <= j) {
            System.out.println("\t" + i);
            if (i != j) {
                System.out.println("\t" + j);
            }
            i++;
            j--;
        }
        sc.close();
    }
}
/* complex to understand and remember for me */