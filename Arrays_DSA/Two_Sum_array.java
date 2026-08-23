package Arrays_DSA;

import java.util.Scanner;

public class Two_Sum_array {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {12, -7, 45, -23, 9, -34, 58, -1, 27, -16, 3, -49, 62, -8, 14, -31};
        System.out.println("The given array is : {12, -7, 45, -23, 9, -34, 58, -1, 27, -16, 3, -49, 62, -8, 14, -31}");
        System.out.println("Enter the target sum you want to find in the array : ");
        int sum = sc.nextInt();
        boolean found = false;
        for(int i=0;i<arr.length;i++){
                for(int j=0;j<arr.length;j++){
                    if(i!=j && arr[i]+arr[j]==sum){
                        System.out.println("The two elements that sum to "+sum+" are at indices "+i+" and "+j+" and the elements are "+arr[i]+" and "+arr[j]);
                        found = true;
                }
            }
        }
        if(!found){
            System.out.println("No two elements found that sum to "+sum);
        }
        sc.close();
    }
}