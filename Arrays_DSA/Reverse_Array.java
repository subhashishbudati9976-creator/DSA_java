package Arrays_DSA;

import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements for the "+n+" sized array : ");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int brr[] = new int[n];
        for(int j=n-1;j>=0;j--){
            brr[j]=arr[j];
        }
        System.out.print("The reversed array is : ");
        for(int j=n-1;j>=0;j--){
            System.out.print(brr[j]+" ");
        }
        sc.close();
    }
}
//We will use 2 variable/pointer technique to reverse the array. We will use one pointer to point to the first element 
// of the array and another pointer to point to the last element of the array. We will swap the elements at these two 
// pointers and then move the first pointer to the right and the second pointer to the left until they meet each other.