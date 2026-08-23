//Rotate the array to the left by k steps, where k is non-negative.
//For example, if the array is [1,2,3,4,5] and k=2, then the rotated array will be [3,4,5,1,2].
package Arrays_DSA;

import java.util.Scanner;

public class Rotate_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements of the "+n+" sized array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Now tell me, which direction do you want to rotate the array : ");
        String direction = sc.next().toLowerCase();
        if(direction.equals("left")){
            System.out.println("Enter the index till which you want to rotate the array to the "+direction+" : ");
            int d = sc.nextInt();
            d%=n;//This is to handle the case when d is greater than n. For example, if n=5 and d=7, then d will become 2 after this operation.
            reverse(arr, 0, n-1);
            reverse(arr, 0, n-d-1);
            reverse(arr, n-d, n-1);
        }else if(direction.equals("right")){
            System.out.println("Enter the index till which you want to rotate the array to the "+direction+" : ");
            int d = sc.nextInt();
            d%=n;//This is to handle the case when d is greater than n. For example, if n=5 and d=7, then d will become 2 after this operation.
            reverse(arr, 0, n-1);
            reverse(arr, 0, d-1);
            reverse(arr, d, n-1);
        }else {
            System.out.println("Invalid direction entered! Please enter either left or right.");
            return;
        }
        System.out.println("The rotated array is : ");
        for(int element : arr){
            System.out.print(element+" ");
        }
        sc.close();
    }
    public static void reverse(int arr[],int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
}