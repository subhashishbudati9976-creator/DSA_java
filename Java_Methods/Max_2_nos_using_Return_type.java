package Java_Methods;

public class Max_2_nos_using_Return_type {
    public static void main(String[]args){
        System.out.println(max(9,4,6));//This is not a built in method, max method is a user created method.
    }
    public static int max(int a, int b, int c){//This is a user created method, that works just like the built in max function.
        if(a>=b && a>=c) return(a);
        else if(b>=a && b>=c) return(b);
        else return(c);//NOte that if we are writing a if statement that has a return statement, then it must have a
    }                  //else statement, cuz the return statement is inside the if loop, therefore, java cannot find it.
}
