package Arrays_DSA;

import java.util.Scanner;

public class Reverse_Array_using_While_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements for the " + n + " sized array : ");
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0, j = n - 1;// This is reversing the complete array.
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.print("The reversed array is : ");
        for (int element : arr) {// Used for-each loop to print the elements of the reversed array.
            System.out.print(element + " ");
        }
        sc.close();
    }
}
// Now if we want to just reverse the array elements from index 2 to 5, then
// replace i with 2 and j with 5
// in the while loop. This will reverse the elements from index 2 to 5 in the
// array. Here this is reversing the part
// of the array. The code will work dumbass.