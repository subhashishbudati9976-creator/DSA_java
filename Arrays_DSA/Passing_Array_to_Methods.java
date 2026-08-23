package Arrays_DSA;

public class Passing_Array_to_Methods {
    public static void main(String[]args){
        int arr[] = {1,2,3,4,5};
        int x = 50;
        System.out.println("The value of x before calling the method is : "+x);//Note : The value of x will not change after calling the method because we are passing a copy of the value of x to the method.
        System.out.println("The value of 5th element of the array before calling the method is : "+arr[4]);
        change(arr);
        alter(x);//Call by value
        System.out.println("The value of x after calling the method is : "+x);
        System.out.println("The value of 5th element of the array after calling the method is : "+arr[4]);
    }
    public static int change(int arr[]){//This is a reference variable that holds the reference of the array. So, any changes made to the array inside this method will reflect in the original array.
        arr[4] = 10;
        return arr[4];
    }
    public static int alter(int x){
        x = 100;
        return x;
    }
}//Also note that java is stricly pass by value.


//Note : When we pass an array to a method, we are passing the reference of the array. So, any changes made to the array
//  inside the method will reflect in the original array. However, when we pass a primitive data type (like int, float, etc.)
//  to a method, we are passing a copy of the value. So, any changes made to the primitive variable inside the method will 
// not affect the original variable outside the method.