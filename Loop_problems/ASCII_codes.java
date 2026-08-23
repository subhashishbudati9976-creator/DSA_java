//Print all the ASCII codes with their corresponding characters.
package Loop_problems;

public class ASCII_codes{
    public static void main(String[]args){
        for(int i=65;i<=122;i++){
            System.out.println("ASCII code:"+i+" Character:"+(char)i);
        }
    }
}
/*The only thing you need to know that thhe computer 
already knows the ASCII values of characters. S
o you need to know the (char)i technique to write 
the charecters with the corresponding numbers*/