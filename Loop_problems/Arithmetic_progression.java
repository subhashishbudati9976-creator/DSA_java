//Print an Arithmetic progession for up to 10 terms.
package Loop_problems;

public class Arithmetic_progression {
    public static void main(String[]args){
        int a = 2; // first term
        int d = 3; // common difference
        int n = 10; // number of terms
        System.out.println("The Arithmetic progression is:");
        for(int i=0;i<=n-1;i++){
            System.out.println(a+(i*d));
        }
    }
}