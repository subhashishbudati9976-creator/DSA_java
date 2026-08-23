//Take input for length and breadth of a rectangle and find out whether the area is greater than the perimeter or not.
package If_else_problems;

import java.util.Scanner;

public class Area_Perimeter_compare{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle : ");
        double len = sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle:");
        double brd = sc.nextDouble();
        double area = len*brd;
        double perimeter = 2*(len + brd);
        if(area>perimeter){
            System.out.println("Area is greater than perimter.");
        }else if(area<perimeter){
            System.out.println("Perimeter is greater than area.");
        }else{//condition where area and perimeter are equal
            System.out.println("Area and perimeter are equal.");
        }
        sc.close();
    }
}