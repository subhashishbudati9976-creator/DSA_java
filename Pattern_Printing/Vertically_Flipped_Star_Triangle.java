package Pattern_Printing;

import java.util.Scanner;

public class Vertically_Flipped_Star_Triangle {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows you wanna print the vertically flipped star triangle : ");
        int vfst = sc.nextInt(); //vfst=Vertically Flipped Star Triangle
        ////Method 1:
        //for(int i=1;i<=vfst;i++){
        //    for(int j=1;j<=vfst;j++){
        //        if(i+j<=vfst){
        //            System.out.print("  ");
        //        }else{
        //            System.out.print("* ");
        //        }
        //    }
        //    System.out.println();
        //}
        //Drawback is that following this logic for every code will give error. So method 2 is the best.
        //Method 2 :
        for(int i=1;i<=vfst;i++){
            for(int j=1;j<=vfst-i;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /*First printing the blank spaces(here im representing in #) in the following pattern:(Lets say vfst=5)
            # # # # #
            # # # #
            # # # 
            # # 
            #
        Now we will run the same star triangle code as a second for loop in the same outer for loop.
        So the stars will eventually adjust itself, as a vertically flipped triangle due to already printed
        blank spaces(#) triangle. So this will go from:
            # # # # #         *                 # # # # # *
            # # # #           * *               # # # # * *
            # # #       +     * * *       =     # # # * * *  
            # #               * * * *           # # * * * *
            #                 * * * * *         # * * * * *
        Eventually if you replace # with blank spaces( ), you get the desired output.
                       *
                     * *
                   * * *
                 * * * *
               * * * * *
        Yay!
    */
        sc.close();
    }
}
