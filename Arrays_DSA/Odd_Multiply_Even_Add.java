//multiply even indexed elements by 2 and add 10 to odd indexed elements
package Arrays_DSA;

import java.util.Scanner;

public class Odd_Multiply_Even_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array : ");
        int arr[] = new int[sc.nextInt()];
        System.out.println("Enter the elements of "+arr.length+" sized array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("We have to multiply odd indexed elements by 2 and add 10 to even indexed elements respectively.");
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i]=10+arr[i];
            }else{
                arr[i]=2*arr[i];
            }
        }
        System.out.println("The new array after the array index operation is : ");
        print(arr);
        sc.close();
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
