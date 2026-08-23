package Arrays_DSA;

import java.util.Scanner;

public class Array_Print_negative_numbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size bro! : ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("The length of the array is : "+arr.length);
        System.out.println("Enter the elements for "+size+" sized array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                System.out.print(+arr[i]+" ");
            }
        }
        sc.close();
    }
}