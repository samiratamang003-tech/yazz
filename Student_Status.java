import java.util.Scanner;

/**
 * Write a description of class Student_Status here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student_Status
{
   public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Grade: ");
        int grade= input.nextInt();
        //ternery operator
        String isValid= (grade>=40)? "Pass" :"Fail";
        System.out.println(isValid); 
    }
}