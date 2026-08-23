package Java_Methods;

public class Syntax {
    public static void Nani(){
        System.out.println("What's popping fucker! This is the number of times your mind is fucked! : ");
        for(int i=1;i<=50;i++){
            System.out.print(i+" ");
        }
        System.out.println();
        Hasini();
    }
    public static void main(String[]args){//This is the main function. Java always gives priority to this method first.
        System.out.println("Hello, world!");
        Nani();//This is called Function call or Method Call. So the Nani method is called, so it goes to the nani function and runs its code.
    }
    public static void Hasini(){
        System.out.println("Ravinder!");
        lucky();
        Jashu();//We can call two or more methods in a single method also.
    }
    public static void lucky(){
        Jashu();
        System.out.println("Nandu!");
    }
    public static void Jashu(){
        System.out.println("Srestitha");
        //if you call Nani method here, then it will be a segmentation fault, i.e infinite loop, so Java will give and error.
    }
}
//Note that you can never call the main function. Main functin runs only 1 time, and it is the primary code.
//Notice how the methods are getting called, and travesing and running its code.