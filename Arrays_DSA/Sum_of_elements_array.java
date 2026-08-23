package Arrays_DSA;

import java.util.Scanner;

public class Sum_of_elements_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of "+n+" sized array : ");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int j=0;j<arr.length;j++){
            sum=sum+arr[j];
        }
        System.out.println("The sum of all the elements in the array : "+sum);
        sc.close();
    }
}
