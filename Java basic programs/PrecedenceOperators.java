public class PrecedenceOperators {
    public static void main(String[] args){
        int a=10;
        int b=20;
        int c=5;
        int result=a+b*c; // Multiplication has higher precedence than addition
        System.out.println("Result of a + b * c is : "+result);
        
        result=(a+b)*c; // Parentheses change the order of evaluation
        System.out.println("Result of (a + b) * c is : "+result);
    }
}
