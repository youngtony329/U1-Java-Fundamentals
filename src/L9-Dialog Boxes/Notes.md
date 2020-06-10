# Unit 1 - Java Fundamentals

## [L9 Sandbox][sandbox]

## Dialog Boxes

The console isn't the only way to retrieve and display information. It's time to say "Goodbye" to the console and "Hello" to pop-up boxes!

Pop-up boxes, known as Dialog Boxes, provide another way to add interactivity to your programs. 

**How does one add a dialog box?** There's a class for that.

Again, there are three parts: **Import**, **Object Creation** and **Method Calls**

### Import

The class which controls dialog boxes is `JOptionPane` and its found in the `javax.swing` package. 

`import javax.swing.JOptionPane;`

*note: Be sure to capitalize correctly or use the auto-complete function of IntelliJ*

### Object Creation

GREAT NEWS! `JOptionPane` is a static class, like `Math` and `System` which doesn't need an object to call its methods.

### Method Calls

**OUTPUT**: `.showMessageDialog(null, "Output message");`

The output message can include everything we've done in `System.out.println`

**INPUT**: `.showInputDialog("Display message");`

This will show the display message with an input text box below it.


This program will prompt a user to enter their first and last name, then display it back. You may run the following program in the [**Sandbox**][sandbox].

```java
import javax.swing.JOptionPane;

public class L9{
    public static void main(String[] args){
        
        String firstName;
        String lastName;
    
        firstName = JOptionPane.showInputDialog("What is your first name?");
        lastName = JOptionPane.showInputDialog("What is your last name?");
        
        JOptionPane.showMessageDialog(null, "Hello " + firstName + " " + lastName);
        
        System.exit(0);        
    }
}
```
Notice how the input dialog gets assigned to a variable. If not, the user's input would just be floating in cyberspace. Also, notice how the program pauses execution until the pop-up is dealt with, then processes the next line. Lastly, notice how the program ends with `System.exit(0)`. 

A program with graphical interfaces runs those on independent tasks known as a **thread**. Thread do not automatically stop executing. This last line of code stops the execution of all threads. If we omit this, the program would coninue running in the background, even though no UI is shown to the user. Viruses much?

## String Conversions and Parsing Data

Though using dialog boxes may seem simpler than `Scanner` and `System.out`, there is a catch, a big catch. 

All data received by the input dialog box is received as a **STRING**, meaning text. 

Run the following in the [**SANDBOX**][sandbox]
```java
import javax.swing.JOptionPane;

public class L9{
    public static void main(String[] args){
        int hours;
        double hourlyRate;
        double wage;
        
        hours = JOptionPane.showInputDialog("How many hours did you work?");
        hourlyRate = JOptionPane.showInputDialog("What is your hourly rate?");
        
        wage = hours * hourlyRate;
        
        JOptionPane.showMessageDialog(null, "Your wages are $" + wage);
        
        System.exit(0);
    }
}
``` 
You should notice an error. Can't convert `String` to `int`. But, if you change hours and hourlyRate to `String`, then you can't do the math to calculate `wage`. 

The solution is doing much the same with dialog boxes as we did with `Scanner` methods. We must take the input and converted to a usable data-type. 

**How can we convert a String to a data-type?** There's a class for that.

Well, actually many classes. Each data-type other than `String` has a class associated with it. Each of those classes has a method used to convert a `String` to the class's data-type. These classes are also static and don't require an object.

* `Double.parseDouble(String)` - converts the `String` to a `double`
* `Integer.parseInt(String)` - converts the `String` to an `int`

We're going to make re-use a variable, `inputString`, to get the data from the user, then use the methods above to convert it to usable form. Go ahead and use the [**Sandbox**][sandbox] to test.

```java
import javax.swing.JOptionPane;

public class L9{
    public static void main(String[] args){
        String inputString;
        int hours;
        double hourlyRate;
        double wage;
        
        inputString = JOptionPane.showInputDialog("How many hours did you work?");
        hours = Integer.parseInt(inputString);
        
        inputString = JOptionPane.showInputDialog("What is your hourly rate?");
        hourlyRate = Double.parseDouble(inputString);
        
        wage = hours * hourlyRate;
        
        JOptionPane.showMessageDialog(null, "Your wages are $" + wage);
        
         System.exit(0);
    }
}
``` 
 

[sandbox]: ../L9.java