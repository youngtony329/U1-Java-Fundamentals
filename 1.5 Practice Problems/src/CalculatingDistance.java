public class CalculatingDistance {

    /*
    Create a program that calculates a vehicle's distance based on speed traveled and time traveled.

    Example: 55 mph for 45 minutes -> 41.25 miles

    */

    public static void main(String[] args) {

        double speed = 45;
        double time = 18;

        double minutes = time/60.0;

        double distance = speed * minutes;

        System.out.println("The distance traveled is: " + distance + " miles");


    }
}
