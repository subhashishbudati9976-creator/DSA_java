//Print all odd numbers between 1 and 100 which are divisible by 3.
package Loop_problems;

public class Even_no_divisible_by_4 {
    public static void main(String[]args){
        for(int i=2;i<=100;i=i+2){
            if(i%4==0){
                System.out.println(i);
            }
        }
    }
}