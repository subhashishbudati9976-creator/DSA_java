//Take integer three inputs and determin if they can form the sides of a triangle or not.
package If_else_problems;

import java.util.Scanner;

public class Triangle_problem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length for the three sides of the triangle:");
        double x = sc.nextDouble();
        double y = sc.nextDouble();
        double z = sc.nextDouble();
        if(x+y>z && y+z>x && z+x>y){
            System.out.println("The three sides can form a triangle.");
        }else{
            System.out.println("The three sides cannot form a triangle.");
        }
        sc.close();
    }
}