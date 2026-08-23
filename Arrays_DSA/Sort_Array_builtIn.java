package Arrays_DSA;

import java.util.Scanner;

public class Sort_Array_builtIn {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of the "+arr.length+" sized array :");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        java.util.Arrays.sort(arr);
        System.out.print("The sorted array is : ");
        print(arr);
        sc.close();
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
