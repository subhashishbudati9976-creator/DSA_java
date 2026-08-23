package Arrays_DSA;

import java.util.Scanner;

public class Linear_Searching_Arrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("The given array is : {12,23,-34,21,-32,34,-45,-786,-34,23455,56,-67,78,89,-90,-100}");
        int[] arr = {12,23,-34,21,-32,34,-45,-786,-34,23455,56,-67,78,89,-90,-100,23};
        System.out.print("Enter the element that you want to search in the given array : ");
        int n = sc.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("The element is found at index : "+i);
                break;
            }
        }
        System.out.println("The element is not found in the given array, btw fuck you for using the code.");
        sc.close();
    }
}
