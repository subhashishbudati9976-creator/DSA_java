//Print a Geometric progression for upto 10 terms.
package Loop_problems;

public class Geometric_Progression {
    public static void main(String[]args){
        int a=3;//First term
        int r=2;//Common ratio
        System.out.println("The Geometric Progression is :");
        for(int i=1;i<=10;i++){
            System.out.println(""+a*(Math.pow(r,i-1)));
        }
    }
}