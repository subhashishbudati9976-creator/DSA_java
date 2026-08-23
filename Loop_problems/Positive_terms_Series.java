//Print this series- 99,95,91,87....upto all terms which are positive.
package Loop_problems;

public class Positive_terms_Series {
    public static void main(String[]args){
        System.out.println("The Series is:");
        for(int i=99;i>=0;i=i-4){
            System.out.println(""+i);
        }
    }
}