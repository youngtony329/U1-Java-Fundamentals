public class L3 {

    //add the main method header below.

     /*literal Value is a value written directly into code
     An Expression is a value using variables or operators
      */

    public static void main(String[] args) {
        int literalValue = 5;
        int literalValue2 = 6;
        int expression1 = 5+6;
        int expression2 = literalValue + 6;
        int expression3 = literalValue + literalValue2;

        //Examples of literal Values
        double literalExample1 = 3.4;
        boolean literalExample2 = true;
        String literalExample3 = "APPLE";

        //Examples of Expressions
        double expressionExample = 5 + 6;
        boolean expressionExample2 = 5 > 6;

        //bad example
        //int badExample = 5.4 - 0.4;

        //A String expression is called String Concatenation. You can combine String usng the +
         String expressionExamples3 = "A fruit people is an " + literalExample3;

         //Example program

        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;

        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);

    }
}
