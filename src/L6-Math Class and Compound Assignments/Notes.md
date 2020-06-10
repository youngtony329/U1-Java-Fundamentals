# Unit 1 - Java Fundamentals

## [L6 Sandbox][sandbox]

## The `MATH` Class

Java provides a class, like `System` or `String` called [**Math**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html). This class provides multiple methods to compute common math functions. We will only focus on two in this course, **Math.pow()** and **Math.sqrt()**.

[**Math.pow(double a, double b)**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#pow-double-double-) raises `a` to the power of `b` and returns the answer as a `double`.

[**Math.sqrt(double a)**](https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html#sqrt-double-) takes the square root of `a` and returns the answer as a `double`.

When you create a method, you can also define **parameters**, and those parameters also have data-types. Values that you pass into the method, called **arguments**, must match the data-type of the parameters. Take note that all `int` types can be made `double` by adding `.0` at the end, which is most cases Java will do for you.

 The variables storing the data from these methods must also match the return data-type.

```java
public class L6{
    public static void main(String[] args){
        int value1 = 4;
        double value2 = 1.2;
        
        int powerScore1;
        double powerScore2, squareRoot1;
        
        powerScore1 = Math.pow(value1, value2); //throws an error
        powerScore2 = Math.pow(value1, value2); //returns 5.278031643091577
    
        squareRoot1 = Math.sqrt(value2); //returns 1.0954451150103321
    }
}
```
First, notice that you can declare 2 or more variables of the same data type by separating the identifiers with a comma as shown with `powerScore2` and `squareRoot1`. 

After the declarations, we see that the first assignment statement throws and error. Math.pow returns a `double` which we are trying to assign to an `int`. Java does not like this. 

Next, we see an example of how Java takes the `int` 4 and accepts it as a `double` for the first argument of the method, using 4.0. 

Also notice that Java does not round the answer. You will get the exact number up to the amount of decimal places the data-types can hold. We will cover rounding later. 

## Compound Assignments

Consider a program where you would like to keep a running total, like the balance in your bank account after deposits, or the number of apples in a basket as you pick them from the trees.

Imagine you are picking apples from a tree and putting them in the basket. How many apples do you hold in your hand each time you pick an apple? How many apples are in the basket?

Some might write this program as: 
```
appleSum = 0
appleSum = 1
appleSum = 2
appleSum = 3
```
There are two problems with this approach, first and most important being that the programmer is keeping track of the total with literals instead of allowing the computer to do it. The second, less obvious, is that the best computer programs attempt to simulate the real-world and this program implies that the apple-picker first picks 1, then 2, then 3. 

A better solution is shown below. Try this in the  [**SANDBOX**][sandbox]

```java
public class L6{
    public static void main(String[] args){
        
        int applesInHand = 1;
        int applesInBasket = 0; 
        
        //pick one apple
        applesInBasket = applesInBasket + applesInHand;
        
        //pick one apple
        applesInBasket = applesInBasket + applesInHand;
        
        //pick one apple
        applesInBasket = applesInBasket + applesInHand;
        
        System.out.println("You've picked " + applesInBasket + " apples");       

    }
}
```

In this program, we start with 0 apples in the basket. Each time we pick an apple we add 1 to the basket. We simulate this action of picking apples by repeating the process three times. Later when we discuss **Loops** we will look at how to automate this further. 

Notice how the variable `applesInBasket` is being re-used. Programmers LOVE to make things as efficient as possible. Efficiency meaning less code, less code means less work. Thus, programmers pride ourselves on being "efficiently lazy".  Instead of typing `applesInBasket` twice, we can use a [**compound assignment**](https://www.tutorialspoint.com/Compound-assignment-operators-in-Java) to shorten the code and increase efficiency. 

The program above could be re-written as:
```java
public class L6{
    public static void main(String[] args){
        
        int applesInHand = 1;
        int applesInBasket = 0; 
        
        //pick one apple
        applesInBasket += applesInHand;
        
        //pick one apple
        applesInBasket += applesInHand;
        
        //pick one apple
        applesInBasket += applesInHand;
        
        System.out.println("You've picked " + applesInBasket + " apples");   

    }
}
```
Notice here we rewrote `applesInBasket = applesInBasket + applesInHand;` to simply `applesInBasket += applesInHand`. Both these statements do the exact same thing. All the **arithmetic operators** have compound assignment statements.

![](compound-assignments.png)

### Increment and Decrement

Probably the most used computation in any programming language is adding 1 to a total or subtracting 1 from a total. Because of this, there are special compound assignments, `++` and `--`. 

```java
x++     equivalent to       x = x + 1;  or  x+=1;
x--     equivalent to       x = x - 1;  or  x-=1; 
```

This allows us to make our ApplePicker program even MORE efficient by eliminating a variable altogether. Try this in the  [**SANDBOX**][sandbox]

```java
public class L6{
    public static void main(String[] args){
        
        int applesInBasket = 0; 
        
        //pick one apple
        applesInBasket++;
        
        //pick one apple
        applesInBasket++;
        
        //pick one apple
        applesInBasket++;
        
        System.out.println("You've picked " + applesInBasket + " apples");   

    }
}
```

Let's hit the [**SAND**][sandbox]

[sandbox]: ../L6.java