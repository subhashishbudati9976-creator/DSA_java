//Take a point from user and write a program to find out if it lies in which quadrant, or which axis
package If_else_problems;

import java.util.Scanner;

public class Location_of_point {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the x-coordinate:");
        double x = sc.nextDouble();
        System.out.println("Enter the y-coordinate:");
        double y = sc.nextDouble();
        if(x>0 && y>0){
            System.out.println("The point lies in the first quadrant.");
        }
        else if(x<0 && y>0){
            System.out.println("The point lies in the second quadrant.");
        }
        else if(x<0 && y<0){
            System.out.println("The point lies in the third quadrant.");
        }
        else if(x>0 && y<0){
            System.out.println("The point lies in the fourth quadrant.");
        }
        else if(x==0 && y!=0){
            System.out.println("The point lies on the y-axis.");
        }
        else if(x!=0 && y==0){
            System.out.println("The point lies on the x-axis.");
        }
        else{
            System.out.println("The point is at the origin.");
        }
        sc.close();
    }
}
