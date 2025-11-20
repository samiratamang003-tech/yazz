import java.util.Scanner;

/**
 * Write a description of class StudentInfo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentInfo
{
    public static void main (String[]args){
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter student name");
        String name= scan.nextLine();
        System.out.println("Enter student age");
        int age= scan.nextInt();
        System.out.println("Enter student GPA");
        double GPA= scan.nextDouble();
    }
}
        
        