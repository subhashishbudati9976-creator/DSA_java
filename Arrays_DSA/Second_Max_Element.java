package Arrays_DSA;

public class Second_Max_Element {
    public static void main(String[] args) {
        int[] arr = {4,10,10,6,3,8,9,2,1};
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }//First find the first max element in the array
        int secmax = arr[0];
        for(int j=0;j<arr.length;j++){
            if(arr[j]>secmax && arr[j]<max){
                secmax=arr[j];
            }
        }//Now exclude the first max element and then use a second loop to find the second max element in the array.
        System.out.println("The second maximum element in the array is : "+secmax);
    }
}    
//Very good bro, till now you have solved 116 questions in DSA, keep it up and keep learning. 
//You are doing great, just keep practicing and you will become a master in DSA.
//(btw Autotyped by copilot assistant in vs code)