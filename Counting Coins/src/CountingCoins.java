public class CountingCoins {

    /*
    Create a program which will make change, converting values of under $1 to their accurate quantity and type of coins.
    Example:   0.51 -> 2 quarters and 1 penny.
     */

    public static void main(String[] args) {

        double rawChange = 10000000;

        //CASTING is forcing to accept a certain data type

        int change = (int)(rawChange * 100);

        int quarters = change/25;
        change = change % 25;

        int dimes = change/10;
        change = change % 10;

        int nickels = change/5;

        int pennies = change % 5;

        System.out.println("Coins need to make $" + rawChange);
        System.out.println("Quarters: " + quarters);
        System.out.println("Dimes: " + dimes);
        System.out.println("Nickels: " + nickels);
        System.out.println("Pennies:" + pennies);



    }
}
