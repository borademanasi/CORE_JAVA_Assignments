import java.util.Scanner;
class Grade{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the grades in Numeric");
        int grade=sc.nextInt();
        if(grade>=90)
        {
            System.out.println("A");
        }
        else if(grade<90 && grade>=75)
        {
            System.out.println("B");
        }
        else if(grade<70 && grade>=60)
        {
            System.out.println("C");      
        }
        else if(grade<60 && grade>=45)
        {
            System.out.println("D");
        }
        else
        {
             System.out.println("F");
        }
        

    }
}