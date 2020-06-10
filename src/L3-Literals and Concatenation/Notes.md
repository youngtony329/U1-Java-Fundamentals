# Unit 1 - Java Fundamentals

## [L3 Sandbox][sandbox]


## Literal Values

A [**literal value**](https://www.tutorialspoint.com/What-are-literals-in-Java) is a value that is written directly into the code. Sometimes this is referred to as **hard-coded** data. Try this in the [**SANDBOX**][sandbox].

```java
public class L3{
    public static void main(String[] args){
        
        int literalValue = 5;
        
        System.out.println("The variable's value is: ");
        System.out.println(literalValue);
  
    }
}
```
In this example, we see a literal value `5` being assigned to the variables `literal value`. `5` is written directly into the code. The first output command also contains a literal value, `The variable's value is: `. Notice in the second `println` command, there are no quotation marks around the variable name. This tells Java to print the value of the variable, which in this case is `5`. 

To better understand the **types** of data variables can hold, let's look at some literal values we can assign to different types of data.

### Double and Float

Floating-point data is any data that contains a decimal. There are two data-types for decimals [**float**](https://javarevisited.blogspot.com/2016/05/difference-between-float-and-double-in-java.html) and [**double**](https://javarevisited.blogspot.com/2016/05/difference-between-float-and-double-in-java.html). `float` is used for smaller decimals, 6 to 7 decimal digits,  whereas `double` is more accurate, used for larger decimals, 15 to 16 decimal digits.

```java
public class FloatingPointLiterals{   

    public static void main(String[] args){
        
        double firstExample = 4.568902567;
        float secondExample = 7.6890f;
    }
}
```
By default, floating-point numbers are `double` data-types in Java. So you will notice, when we assign a literal to a `float` type, we include an `f` to tell Java we want to use this as a `float` so that the **type** and the **value** match.  

### Char and String

`char` and `String` are data types used for text data. If you remember from earlier, **objects** are created from classes and can call methods. Unlike the other data-types, the `String` data type has a class and is an object. We will learn more about the `String` object later. For now, simply consider it a string of characters, or a line of text.

`char` data-type is a single characters and has a dual meaning. This data-type is based on the [**ASCII**](https://www.braingle.com/brainteasers/codes/ascii.php) chart. If you take a look at this simplified chart, you will see that each letter and number has an ASCII value. With the `char` data-type, you can use either the numeral literal or the character literal.    
```java
public class CharLiterals{
    public static void main(String[] args){
      
        char firstLiteral = 'A';
        char secondLiteral = 65;
        
        String thirdLiteral = "A";
        String fourthLiteral = "65";
    
    }
}
```
The first thing to notice when using `char` and `String` literals is that `char` uses single quotes around single characters and `String` uses double quotes. As you will see later when we run some code examples, `firstLiteral` and `secondLiteral` will output `A` to the console, while the other two will output their exact values as you see them.

A `String` literal will print EXACTLY what is included inside the double quotation marks including any spaces. 

## Concatenation

[**String Concatenation**](https://www.javatpoint.com/string-concatenation-in-java) uses the `+` to add, or display, two `Strings` together. It can also be used to add a variable's value, as a `String`, to the output. Try this in the  [**SANDBOX**][sandbox]

```java
public class L3{
    public static void main(String[] args){
        
        String message1 = "The store has ";
        String message2 = " apples in stock.";
        int numApples = 20;
        
        System.out.println("The store has 20 apples in stock.");
        System.out.println("The store has " + numApples + " apples in stock");
        System.out.println(message1 + numApples + message2);
    }
}
```

The three output commands will all print exactly the same thing, but they are all unique. The first is a `String` literal and the data is hard-coded in the program. This means that if the number of apples changes, it would have to be changed manually in this line. 

The second command uses **concatenation** to add two `String` literals with the value stored in `numApples`. This allows you to change the value of apples once, at the top of the program, and it will change it for every call to `numApples`.  

The third command **concatenates** all three variables, allowing you to change the variables once, at the top of the program, and it will update for every call to each of those variables. 

Typically, programmers try to avoid hardcoded data unless it is data that will never change. In most programs, the information that displays is dependent on user input. 

Let's look at some examples: [**L3 Sandbox**][sandbox].


[sandbox]: ../L3.java