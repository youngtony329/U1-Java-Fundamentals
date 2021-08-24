public class SteamDiscount {

    /*
    A game on Steam costs $60.00, but is currently on sale for 20% off. Create a program to display how much the game costs after the discount.
     */

    public static void main(String[] args) {

        double gamePrice = 59.99;

        double gameSale = 0.20;

        double afterSale = gamePrice * gameSale;

        double endPrice = gamePrice - afterSale;

        System.out.println("The current price is " + endPrice);



    }

}
