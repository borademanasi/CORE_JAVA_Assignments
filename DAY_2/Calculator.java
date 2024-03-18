import java.util.*;
class Calculator
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int no1=sc.nextInt();
        System.out.println("Enter the second number:");
        int no2=sc.nextInt();
        System.out.println("Which Operation You want to perform");
        char opr=sc.next().charAt(0);
        switch(opr){
            case '+' : System.out.println("The Addition of Two Numbers is :" +(no1+no2));
                       break;

            case '-' : System.out.println("The Subtraction of Two Numbers is:" +(no1-no2));cd 
                       break;

            case '*' : System.out.println("The Multiplication of Two Numbers is:" +(no1*no2));
                       break;

            case '/' : System.out.println("The Division Of Two Numbers is:" +(no1/no2));
                       break;                      
        }
    }
}