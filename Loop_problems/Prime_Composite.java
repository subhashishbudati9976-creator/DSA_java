//Program to check whether a number is composite or not
package Loop_problems;

import java.util.Scanner;

public class Prime_Composite {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to check:");
        int num = sc.nextInt();
        for(int i=2;i<=num-1;i++){//we are checking the number from 2 to num-1 because we know that 1 and num are not the factors of num.
            if(num%i==0){//if num is divisible by any number other than 1 and itself, it is a composite number.
                System.out.println(""+num+" is a composite number.");
                break;//we are breaking the loop because we have already found that num is a composite number, so we don't need to check further.
            }else if(num%i!=0){//if num is not divisible by any number other than 1 and itself, it is a prime number.
                System.out.println(""+num+" is a prime number.");
                break;
            }
        }
        if(num==1){//if num is 1, it is neither prime nor composite.
            System.out.println(""+num+" is neither prime nor composite.");
        }else if (num==0){//if num is 0, it is neither prime nor composite.
            System.out.println(""+num+" is neither prime nor composite.");
        }
        sc.close();
    }
}
/* The logic of this program is that if a number is divisible 
by any number other than 1 and itself, it is a composite number. 
If it is not divisible by any number other than 1 and itself,
 it is a prime number. */