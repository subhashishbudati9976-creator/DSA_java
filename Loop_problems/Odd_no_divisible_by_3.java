//Print all odd numbers between 1 and 100 which are divisible by 3.
package Loop_problems;

public class Odd_no_divisible_by_3 {
    public static void main(String[]args){
        for(int i=1;i<=100;i=i+2){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}