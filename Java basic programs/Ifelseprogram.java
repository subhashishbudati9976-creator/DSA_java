public class Ifelseprogram {
    public static void main(String[]args){
        int m=92;
        if(m>=80){
            if(m>=90){
                System.out.println("A+ grade");
            }
            else if(80<=m && m<90){
            System.out.println("A grade");
            }
        }
        else if(m>=60){
            System.out.println("B grade");
        }
        else if(m>=50){
            System.out.println("C grade");
        }
        else if(m>=40){
            System.out.println("D grade");
        }
        else{
            System.out.println("Fail");
        }   
        String result=(m>=80)?"A grade":(m>=60)?"B grade":(m>=50)?"C grade":(m>=40)?"D grade":"Fail";
        System.out.println(result);
    }
}