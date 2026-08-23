package Arrays_DSA;

import java.util.Scanner;

public class Min_element_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of "+arr.length+" sized array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int min = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("The smallest element in the array is : "+min);
        sc.close();
    }
}
