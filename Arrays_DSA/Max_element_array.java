package Arrays_DSA;

import java.util.Scanner;

public class Max_element_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of "+n+" sized array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        //int max = arr[0]; just to avoid the case when all the elements of the array are negative
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("The greatest element in the array is : "+max);
        sc.close();
    }
}