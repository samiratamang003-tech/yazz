import java.util.Scanner;

/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    public static void main (String[]args){
     Scanner input= new Scanner(System.in);
     System.out.println("Enter first number.");
     int firstNum= input.nextInt();
     System.out.println("First number is "+firstNum);
     System.out.println("Enter second number.");
     int secondNum= input.nextInt();
     System.out.println("Second number is " +secondNum);
     int sum= firstNum + secondNum;
     System.out.println("sum is: "+sum);
    }
}
    
    

    
    
    