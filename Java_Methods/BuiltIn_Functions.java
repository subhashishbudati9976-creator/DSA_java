package Java_Methods;

public class BuiltIn_Functions {
    public static void main(String[]args){
         //Square root
         System.out.println("The square root is : "+Math.sqrt(100));
         //Cube root
         System.out.println("The cube root is : "+Math.cbrt(100));
         //Greatest Integer function aka Floor function
         System.out.println("The greatest integer function is : "+Math.floor(-99.0001));
         //Ceil function i.e Least common divisor ek number ka ceiling, notes dekho.
         System.out.println("The least common divisor is : "+Math.ceil(-99.0001));
         //Min function
         System.out.println("The minimum of these two numbers is : "+Math.min(28,1002));
         //Max function
         System.out.println("The maximum of these two numbers is : "+Math.max(45.83,43.94));
         //Power function, note that we can give decimal on both hands but if a is -ve then b must be an integer only(+ve or-ve).
         //if both are negative decimal number, then the output will be given NaN, which means Not a Number.
         //moreover if a is 0 and b is 0, java results it with 1 which is false. It is a defect in java.
         System.out.println("The power of given number is : "+Math.pow(0,0));
    }
}
