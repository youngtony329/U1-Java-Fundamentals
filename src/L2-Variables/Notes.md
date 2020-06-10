# Unit 1 - Java Fundamentals

## [L2 Sandbox][sandbox]

## Variables

A [**variable**](https://www.w3schools.com/java/java_variables.asp) is simply just a storage container for data in a program. These are the building blocks and the starting point for all programs. Just in Java, they can be picky. 

Java is a *strict strongly-typed* language. Strongly-typed means that every comma, semi-colon, quotation mark, parenthesis and bracket has a meaning and must be used properly. Strict means that a variable's **value** must match its **type**.

 A variable's [**type**](https://www.w3schools.com/java/java_variables.asp) tells what kind of data that variable's value must be. We will primarily focus on 5 data types:
 
 * `int` - stores integers from -2,147,483,648  to  2,147,483,647
 * `double` - stores decimals up to 15 decimal digits
 * `boolean` - stores `true` or `false`
 * `char` - stores a single character
 * `String` - stores text, denoted by double quotes
 
 ### **Declaring a variable** 
 Declaring a variables is specifying the type of the variable and oftentimes its value. This is done by stating the type first, the variable name, known as an **identifier**, then its value.
 
 The following code segment has errors. Can you point them out?
 ```java
public class L2{
    public static void main(String[] args){
      int num1 = 3.4;
      boolean num2 = false;
      double num3 = "4.5";  
    }
}

```
In all Java programs a variable's type and value must match. Always. This seems simple, but on down the road this will cause your programs to bork. Also note the semi-colon at the end of each line. The importance of this will be explained later.

### Identifiers

Identifiers are the names you give to variables. These names and be anything you wish, however there are rules to follow. 

* Rule #1 - Identifiers must have a name that hints at their meaning. 
    * Good Examples: firstName, age, averageScores, theTextToOutput
    * Bad Examples: a, b, c, num1, num2, pic1, pic2, score1, score2

* Rule #2 - Identifiers can contain letters, digits, underscores and dollar signs ($), but that is all.
    * Good Examples: multiplyBy2, _myScore, tax$Applied.
    * Bad Examples: #thisValue, I-Want-Candy, this/file/path
    
* Rule #3 - Identifiers cannot start with a digit. 
    * Good Examples: this2ManyRules, $won'tRemeber, _butWillTry
    * Bad Examples: 2legit2quit, 8MyBreakfast, 7D2D
    
* Rule #4 - Identifiers cannot be the values `true`, `false`, or any other [reserved word](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html)

### Naming Conventions

We programmers don't like to spend time deciphering someone else's code-style. Throughout the coding community is an un-spoken, un-enforced rule when naming things. We will just add this rules to the rules above.

* Rule #5 - Identifiers should follow camelCase where possible. In camelCase style, the first word is always lower-case and every word thereafter is upperCase. 
    * Good Examples: theGoodTheBadAndTheUgly, theWayWeLikeIt
    * Bad Examples: thisCalledsnakecase, ThisIsPascalCase
    
* Rule #6 - Class name identifiers should be noun, and a single capitalized word. 
    * Good Examples: Player, Math, System
    
* Rule #7 - Method name identifiers should be verbs (except main) and should use camelCase.
    * Good Examples: increaseSpeed(), sumTotals(), fireMissiles()

### Displaying Variable Values

Contained in the definitions of the variable types are instruction to Java on how to display them. We will talk about this more later, but that method is called the [**toString()**](https://www.tutorialspoint.com/java/number_tostring.htm) method. This allows us to output a variable's value to the console. Try this in the [**SANDBOX**][sandbox].

```java
public class L2{
    public static void main(String[] args){
        firstName = "George";
        age = 16;
        System.out.println(firstName);
        System.out.println(age);
    }
}
```
In this example we can see that the variable's name is being passed into the `println` command which then displays the variable value into the console but calling that hidden `.toString()` method. 

This would behave identically to the following code:

```java
public static void main(String[] args){
    firstName = "George";
    age = 16;
    System.out.println(firstName);
    System.out.println(age.toString());
}
```

Let's head to the [**Sandbox**][sandbox] and play around with some more examples.

[sandbox]: ../L2.java