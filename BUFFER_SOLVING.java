import java.util.Scanner;

/**
 * Write a description of class BUFFER_SOLVING here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BUFFER_SOLVING
{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scan.nextInt();

        // Buffer clear
        scan.nextLine();

        System.out.print("Enter your name: ");
        String name = scan.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
