import java.util.Scanner;

/**
 * Write a description of class Rickshawfare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rickshawfare
{
    public static void main (String[]args) {
        System.out.println("----------Welcome to Biratnagar Rickshaw Service Fare Calculator!----------");
        System.out.println("------------------------------Our Rates------------------------------:");
        System.out.println("Base Fare: Rs. 50");
        System.out.println("Per km charge: Rs. 15 per km");
        System.out.println("Per minute charge: Rs. 5 per minute");
        System.out.println("Night surcharge: +20% on total fare");
        System.out.println("Local discount: 10% off for distances over 10 km");
        System.out.println("---------------------------------------------------------------------");

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter distance travelled (in kilometer): ");
        int d= scan.nextInt();
        System.out.println("Distance = " +d+ "km");
        System.out.println("Enter time travelled (in minutes): ");
        int t= scan.nextInt();
        System.out.println("Time = " +t+ "min");
        
        System.out.print("Are you a local? (yes/no): ");
        String localInput = scan.next(); 
        boolean isLocal = localInput.equalsIgnoreCase("yes"); // true if yes, false if no

        System.out.print("Is it night travel? (yes/no): ");
        String nightInput = scan.next();
        boolean isNight = nightInput.equalsIgnoreCase("yes"); // true if yes, false if no
        
        int baseFare= 50;
        int perKm=15;
        int perMinute=5;

       double totalFare = baseFare + (d * perKm) + (t * perMinute);

        System.out.println("Total fare (before discount/surcharge) = Rs. " + totalFare);
        totalFare = (isLocal && d > 10) ? totalFare * 0.9 : totalFare;
        totalFare = isNight ? totalFare * 1.2 : totalFare;
        System.out.println("Final Total Fare = Rs. " + totalFare);


        


    }
    }
