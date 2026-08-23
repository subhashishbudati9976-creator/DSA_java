package Java_Methods;//Analyze entire code in your own thought-process like a story

public class Return_Type {
    public static int nani(){//Here 'int' is return TYPE
        System.out.println("Balu!");
        System.out.println("Vignesh");
        return 6;//here this return STATEMENT, this is the end of the code in nani method. If anything's written beyond this, java will throw an error.
    }
    public static void main(String[]args){//The term 'void' is called Return_Type, we can use different data types in place of void, for example int, double etc.
        System.out.println("11-03-2006");             //This void has no value in it, so we need not return any value.
        System.out.println(9+nani());                   //So if we use any other data type like int, float, double, boolean etc, we will definitely have to return any other value.
        nani();//This is called Stand ALone call of nani method.
        int y = nani();//Storing the method
        System.out.println("Adding 24 to the already existing method's value, we get "+(24+y));                                       
        /*Now you need to note one more thing is that, the method nani uses the data type "int", so the method nani
        is now an integer. And we have returned a value of 5, so the value integer nani is 5. This stored integer has
        some codes that can run, like here it wants to run Balu!. So This is a return type. We can also perform 
        arithmetic operations by calling the function inside a command. */
        int f = Subu(5);
        System.out.println(""+(32+f));//input value a=5,5>0, therefore tha value of method subu is 10. Now, 10 is stored in f.
        System.out.println();        //The value of 32+f=42.
    }
    public static int Subu(int a){
        System.out.println("I do beatboxing!");
        if(a>0) return 10;
        else return 12;
    }
}
