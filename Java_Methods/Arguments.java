package Java_Methods;

public class Arguments {
    public static void sum(int a, int b, float c){//These "int a" and "int b" are called parameters. So we say we are passing the parameters 'int a' and 'int b' in the method sum respectively.
        System.out.println(a+b-c);
    }
    public static void max(int x, int y, int z){
        System.out.println(Math.max(Math.max(x,y),z));
    }
    public static void main(String[]args){
        sum(4,3,9);//These are called ARGUMENTS.
        max(34,28,-2);
    }
}
