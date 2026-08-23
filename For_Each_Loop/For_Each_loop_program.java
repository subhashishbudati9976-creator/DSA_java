package For_Each_Loop;//It is used to traverse through the elements of an array or a collection. It is more concise and easier to read than a traditional for loop.

import java.util.Scanner;

public class For_Each_loop_program {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int n = sc.nextInt();
        System.out.println("Enter the array elements for the "+n+" sized array : ");
        int arr[] = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("The array elements are : ");
        for(int element:arr){//This is a for-each loop. It is used to iterate through the elements of an array or a collection. It is more concise and easier to read than a traditional for loop.
            System.out.print(element+" ");
        }
        sc.close();
    }
}
