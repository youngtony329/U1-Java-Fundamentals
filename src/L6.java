public class L6{
    public static void main(String[] args){
        int value1 = 4;
        double value2 = 1.2;

        int powerScore1;
        double powerScore2, squareRoot1;

        //powerScore1 = Math.pow(value1, value2); //throws an error
        powerScore2 = Math.pow(value1, value2); //returns 5.278031643091577

        squareRoot1 = Math.sqrt(value2); //returns 1.0954451150103321

        System.out.println(powerScore2);
        System.out.println(squareRoot1);

        //Math.min(double a, double b) - returns the lower of two values
        //Math.max(double a, double b) - returns the higher of two values

        //Using Math.max/min to return the lowest and highest of three numbers
        int num1 = 1;
        int num2 = 17;
        int num3 = 10;

        //Solution 1
        int max = Math.max(num1, num2);
         max = Math.max(max, num3);

         int min = Math.min(num1,num2);
         min = Math.min(min, num3);

         //Solution 2
        int max2 = Math.max(Math.max(num1, num2), num3);
        int min2 = Math.min(Math.min(num1, num2), num3);

        System.out.println(max2 + " , " + min2);


    }

}
