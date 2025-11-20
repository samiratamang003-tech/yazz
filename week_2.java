import java.util.Scanner;

/**
 * Write a description of class week_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week_2
{
    public static void main(String[]args)
    {
        //ternery operator 
    Scanner scan= new Scanner(System.in);
    int age= scan.nextInt();
    String ok= (age>=18)? "Driving is allowed." : "Driving is not allowed." ;
    System.out.println(ok);
    
}
}