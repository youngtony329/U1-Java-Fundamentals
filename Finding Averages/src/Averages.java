package src;

public class Averages {

    /*
    Create a program to output the averages of 4 values.
    Example: 12, 13, 14, 15 -> 13.5
     */

    public static void main(String[] args) {
        int testScores1 = 12;
        int testScores2 = 13;
        int testScores3 = 14;
        int testScores4 = 15;

        int sumTotal = testScores1 + testScores2 + testScores3 + testScores4;
        double average = sumTotal/4.0;

        System.out.println("The average is " + average);

    }


}
