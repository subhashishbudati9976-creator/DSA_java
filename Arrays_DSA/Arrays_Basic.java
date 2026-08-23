package Arrays_DSA;

import java.util.Scanner;

public class Arrays_Basic {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);    
        int arr[] = new int[7];
        System.out.println("Enter the 7 array elements : ");
        for(int i=0;i<=6;i++){//or we can write i<=arr.length, which is nothing but the number of elements in the array
            arr[i] = sc.nextInt();
        }
        System.out.println("The seven array elements are * 2 : ");
        for(int i=0;i<=6;i++){
            System.out.print(2*arr[i]+" ");
        }
        sc.close();
    }
}