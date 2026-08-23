package Java_Methods;

import java.util.Scanner;

public class Permutation_Combination {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the valur of n and r : ");
        int n = sc.nextInt();
        int r = sc.nextInt();
        
        int nfact=1;
        int rfact=1;
        int n_rfact=1;
        for(int i=1;i<=n;i++){
            nfact*=i;
        }
        System.out.println("The factorial of "+n+"! is : "+nfact);
        for(int j=1;j<=r;j++){
            rfact*=j;
        }
        System.out.println("The factorial of "+r+"! is : "+rfact);
        for(int k=1;k<=n-r;k++){
            n_rfact*=k;
        }
        System.out.println("The factorial of ("+n+"-"+r+")!{(n-r)!} is : "+n_rfact);
        System.out.println("The permutation of "+n+" and "+r+" is : "+((nfact)/((n_rfact))));
        System.out.println("The Combination of "+n+" and "+r+" is : "+((nfact)/((rfact)*(n_rfact))));
        sc.close();
    }
}