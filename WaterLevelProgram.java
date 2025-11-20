import java.util.Scanner;

/**
 * Write a description of class WaterLevelProgram here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WaterLevelProgram
{
    public static void main (String[]args)
    {
        Scanner input= new Scanner(System.in);
        int watervolume= input.nextInt();
        System.out.println("Water Level: "+watervolume);
        //ternery operator
        String isValid= (watervolume<=700)? "Status:Normal" :"WARNING:Water Level reached maximum" ;
        System.out.println(isValid);
        
    }
}