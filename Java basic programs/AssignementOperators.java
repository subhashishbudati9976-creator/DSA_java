public class AssignementOperators {
    public static void main(String[] args){
        int a=10;
        int b=20;
        a+=b; // a=a+b
        System.out.println("The value of a after addition is : "+a);
        a-=b; // a=a-b
        System.out.println("The value of a after subtraction is : "+a);
        a*=b; // a=a*b
        System.out.println("The value of a after multiplication is : "+a);
        a/=b; // a=a/b
        System.out.println("The value of a after division is : "+a);
        a%=b; // a=a%b
        System.out.println("The value of a after modulus is : "+a);
        a&=b; // a=a&b
        System.out.println("The value of a after bitwise AND is : "+a);
        a|=b; // a=a|b
        System.out.println("The value of a after bitwise OR is : "+a);
        a^=b; // a=a^b
        System.out.println("The value of a after bitwise XOR is : "+a); 
        a<<=b; // a=a<<b
        System.out.println("The value of a after left shift is : "+a);
        a>>=b; // a=a>>b
        System.out.println("The value of a after right shift is : "+a);
        a>>>=b; // a=a>>>b
        System.out.println("The value of a after unsigned right shift is : "+a);
    }
}
