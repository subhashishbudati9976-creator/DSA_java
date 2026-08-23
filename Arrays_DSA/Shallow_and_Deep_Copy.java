package Arrays_DSA;

public class Shallow_and_Deep_Copy {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int x[] = arr; //This is a shallow copy. Both arr and x are pointing to the same array in memory. So, any changes made to the array through x will reflect in arr and vice versa.
        int y[] = arr.clone(); //This is a deep copy. y is a new array that is a copy of arr. So, any changes made to the array through y will not affect arr and vice versa.
        System.out.println("The elements of the original array are : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");   
        }
        System.out.println();
        x[3]=40; //This will change the 4th element of the original array to 40 because x is a shallow copy of arr.
        System.out.println("The elements of the shallow copy array are : ");
        for(int i=0;i<x.length;i++){
            System.out.print(x[i]+" ");   
        }
        System.out.println();
        System.out.println("The fourth element of the original array after changing the shallow copy array is : "+arr[3]);//This will print 40 because x is a shallow copy of arr.
        y[3]=400; //This will change the 4th element of the deep copy array to 400 but it will not affect the original array because y is a deep copy of arr.
        System.out.println("The elements of the deep copy array are : ");
        for(int i=0;i<y.length;i++){
            System.out.print(y[i]+" ");   
        }
        System.out.println();
        System.out.println("The fourth element of the original array after changing the deep copy array is : "+arr[3]);//This will print 40 because y is a deep copy of arr and any changes made to y will not affect arr.
    }
}
