# Unit 1 - Java Fundamentals

## [L4 Sandbox][sandbox]


## Assignment Statements

The [**assignment operator**](https://www.tutorialspoint.com/java/java_assignment_operators_examples.htm) stores, or assigns, values to variables. The `=` symbol is used to specify an assignment.  

```java
class Assignments{
    public static void main(String[] args){
        
        int value = 5;
    }
}
```
The assignment operator reads "value is assigned 5". This is the technical understanding, but this is most often shortened to "value is 5". 

### Reuse Variables

Each time you declare a variable, it creates space on the user's computer to store data. Even though this is very small, too many variables or even declaring un-used variables could bog down a program. 

Variables can be re-used, or rather re-assigned, and can only hold 1 value at a time. The value of a variable is the last assignment statement called. Try this in the  [**SANDBOX**][sandbox]

```java
class L4{
    public static void main(String[] args){
        
        int number = 5; 
        System.out.println(number);
    
        number = 6;
        System.out.println(number);
    }
}
``` 
Let's break this down a line at a time. 
* `int value = 5` - we create a variable called `number` and assign it the value of 5.
* `System.out.println(number);` - outputs the value of `number` at that point in the program's execution, 5.

* `number = 6;` - Re-assigns `number` to 6. The previous value, 5, is removed and deleted. Notice the variable's type does not need to be declared again. A variable, in Java, cannot change what type of data you've declared. 

* `System.out.println(number);` - outputs the value of `number` at that point in the program's execution, 6.

To fully understand what is going on behind the scenes, the flow of execution.

### Flow of Execution

Java will execute, or run, a program starting at the top to the bottom. It will read a line, or a few lines of code, then it will execute what it has read.  

When the `RUN` button is pressed, Java scans the classes for the `main` method and begins executing the code INSIDE the `main` method. 

How does it know what's inside? The brackets. These brackets define the **scope** of the method. Anything inside the brackets are part of the scope of the `main` method. 

Like any good student should, Java will first **READ** a code statement **BEFORE** it executes it. As its reading, its checking for bugs; errors in the code. The `;` at the end of a statement tells Java to stop reading and execute. It symbolizes the end of a statement. When Java encounters `;` it will execute all the code its read up to that point. 

However, Java can only execute one coding statement at a time. So if it reads what should be another coding statement before the prior coding statement is finished, it produces an error. We will look at these errors in the sandbox. 

[**PAY ATTENTION TO THE SMALL DETAILS.**]()

Back to re-assignment, in the program above, Java first reads and assigns 5 to `number`. Then it outputs the value of `number` which at that point in the program is 5. Next, the program re-assigns 6 to `number` and outputs, which at that point in the program the value of `number` is 6 since the reassignment and output comes after the original assignment. 

[**ORDER IS IMPORTANT!!!**]()

### Constant Values

Sometimes you may want a variable that can't be re-assigned. These are called [**constant values**](https://www.tutorialspoint.com/what-is-a-constant-and-how-to-define-constants-in-java) and they are declared using the keyword `final`.

The naming convention used for a constant values identifier is to use all upper-case letters.

```java
public class Constants{
    public static void main(String[] args){
        
        final int GRAVITY = -9.8; 
    }
}
```

This program shows how to declare a constant term.

Let's go to the [**SANDBOX**][sandbox] and investigate assignments and constants.



[sandbox]: ../L4.java