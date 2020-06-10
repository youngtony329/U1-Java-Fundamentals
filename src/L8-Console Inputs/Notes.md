# Unit 1 - Java Fundamentals

## [L8 Sandbox][sandbox]

## Console Inputs

We have been primarily editing literal values to run code and update changes. Now we get **INTERACTIVE**!

Just like `System.out` displays information to the console, `System.in` can be used to READ information from the console. However, it read information at a byte-level, so we'll need to use something to convert from byte to readable format. 

Yep, there's a class for that!

The `Scanner` class allows us to read information from the console and convert it to usable data-types via **methods**.

Remember the three parts: **Import**, **Object Creation** and **Method Call**

### Import

We will simply just need to import the `Scanner` class from the `java.util` package. 

`import java.util.Scanner;`

### Object Creation

Next, we will need to declare and create an object of the `Scanner` class. You can give this object any identifier you want however the more common ones are: `scan`, `keyboard`, `read` and `get`(less used than others). I will use `read`. Don't forget to include the keyword `new` to create the object.

We will also need to pass as an argument, `System.in` so the scanner object knows where to get the data.

`Scanner read = new Scanner(System.in);`

### Method Call

There are four methods we will focus on:

* `nextInt()` - returns the next console input as an `int`
* `nextDouble()` - returns the next console input as a `double`
* `next()` - returns the next word of the console input as a `String`
* `nextLine()` - returns the entire line, up to a carriage return, of the console input as a `String` 

Notice all of these methods include the descriptor **next**. By default, Scanner reads from space to space. If a user inputs `5` and `3` with a space between them, the first call to `nextInt()` will return the 5 and the second will return the 3.

Let's see it all in action! TO THE [**SANDBOX**][sandbox]!


[sandbox]: ../L8.java