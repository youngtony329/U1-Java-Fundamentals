# Unit 1 - Java Fundamentals

## [L7 Sandbox][sandbox]

## Rounding

"There's an app for that." 

This common cliche phrase can be modified to better explain Java's structure: 

"There's a class for that."

**How do you calculate exponents?** There's a class for that. 

**How do you output to the console?** There's a class for that.

**How do you create graphical user interfaces (GUI)?** There's a class for that.

**How do you round?** There's a class for that. 

And to understand how these classes work, let's look at the [**Java Documentation**](https://docs.oracle.com/javase/8/docs/api/)

Java is a large collection of [**packages**](https://www.tutorialspoint.com/java/java_packages.htm) which contain **classes** grouped together by related topics and content. For example, the `java.awt` package contains all the classes for creating user interfaces and managing graphics. The `java.io` handles input/output to files and `java.utils` is a collection of just helpful utilities, many of which we will use in this course.

These classes define [**objects**](https://www.tutorialspoint.com/java/java_object_classes.htm) which are used to call [**methods**](https://www.tutorialspoint.com/java/java_methods.htm) which execute a specific task. The `.` operator on objects invokes, or calls, methods from the class the object is from. However, some classes like the `Math` class, are called **static** classes and do not need objects to call their methods.

Rounding uses the [**Decimal Format**](https://docs.oracle.com/javase/8/docs/api/java/text/DecimalFormat.html) class of the `java.text` package. However, the only package loaded when Java runs is `java.lang` so we'll need to use an import statement, above the class header, to tell Java to include the packages we need. 

This program demonstrates how to round decimals. 
```java
import java.text.DecimalFormat;  //importing the class from the package

public class L7{
    
    public static void main(String[] args){
        
        //creates a decimal object roundTo2 and initializes it.
        DecimalFormat roundTo2 = new DecimalFormat("0.00");

        //creates a decimal object roundTo3 and initializes it.
        DecimalFormat roundTo3 = new DecimalFormat("0.000"); 
        
        //creates a double variable number and assigns it a decimal value
        double number = Math.sqrt(2);
        
        //METHOD 1: OUTPUT BY ASSIGNING TO ANOTHER VARIABLE

        //using the roundTo2 object to call the format method from the DecimalFormat class.
        String displayNumber = roundTo2.format(number);
        System.out.println("The number rounded to 2 decimals is " + displayNumber);
        
        //METHOD 2: OUTPUT BY CALLING THE METHOD IN THE PRINTLN COMMAND
        
        //using the roundTo2 object to call the format method from the DecimalFormat class.
        System.out.println("The number rounded to 3 decimals is " + roundTo3.format(nnumber));        
    }
}
```

If you don't completely understand everything that is happening here, it is okay as we will be thoroughly going over how classes, objects and methods work. At this point, there are three main things you need to know and include in your programs. 

### Import Statement

Whenever you use a class from a package other than `java.lang` you must include the import statement at the top of the program above the class header. 

You can either call the class directly, as we have done in this program, and it is the recommended way. If you aren't sure which class you need you can use the wildcard symbol `*` to include all classes from the package. Be careful with this as it will eat up a user's computer power if you install more classes than you actually need. 

Example of a wildcard call: `jave.awt.*`

How do you know which classes to use?  **Experience.** 

### Object Creation

At this point, you can consider classes like data-types. For this program, we wanted to use the `.format()` method from the `DecimalFormat` class. This is the method responsible for displaying a rounded decimal. To call that method, we need an object of the data-type `DecimalFormat`.

Here we declare an object, with an identifier we choose, and create it using the `new` keyword. 
`DecimalFormat roundTo2 = new DecimalFormat("0.00");`

The `DecimalFormat` class requires us to specify how many decimals we want to display and so we pass in the argument "0.00" to symbolize 2 decimals. Our second object `roundTo3` passes "0.000" to symbolize 3 decimals. 

### Method Call

This is what actually does the work. The `.format()` method accepts any decimal value and converts it to a `String`. Stored inside our objects are the arguments we passed to it. For `roundTo2` we passed `0.00` and for `roundTo3` we passed `0.000`.

The object calls the method. `roundTo2` is an object that has stored in it our argument, 0.00. We use the dot operator on the object to invoke or call the method. 

`roundTo2.format(number)` will format `number` based on the argument we passed to `roundTo2`.

`rountTo3.format(number)` will format `number` based on the argument we passed to `roundTo3`

Since these are two different objects, with two different arguments, their outputs will be different. Objects can store data independently of other objects, even those declared from the same class. 

**NOTE**: Keep in mind that this rounding method only changes the TEXT of the number, not its actual value. To have the most accurate answer, rounding should be done at the END of your program. 

Time to see how this rounding stuff works! [**Sandbox**][sandbox]!!

[sandbox]: ../L7.java