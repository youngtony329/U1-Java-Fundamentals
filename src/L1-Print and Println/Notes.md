# Unit 1 - Java Fundamentals

## [L1 Sandbox][sandbox]

## Basic Java Program

Below is an example Java program. A Java program consists of three components: classes, methods and objects. Copy/Paste the code below into the [**SANDBOX**][sandbox]. Press the first green triangle on the line guide to run, or press the green triangle at the top right.

```java
public class L1{
    
    public static void main(String[] args){
        System.out.println("Hello World");
    }
}
```
We will be discussing these three things AT LENGTH in later chapters, but just to give a very basic idea, a class defines objects which execute methods to carry out a task. 

Our program above creates a class called `L1` and in that class is a method, `main`. Notice these names are [**case-sensitive**](https://www.collinsdictionary.com/us/dictionary/english/case-sensitive) meaning that the class names `Hello`,`hello` and `hEllO` could be three different classes. Same follows for method names. 

A method is one specific task that objects defined by the class can execute. For example, the ```main``` method above. However, no object is needed to call the main method as it will be called by the Java compiler and interpreter when we run the program.

Your programs will have this same basic structure. A class with a main method. The [**main method header**](https://www.journaldev.com/12552/public-static-void-main-string-args-java-main-method) is the same for every class and *EVERY* java program must have a main method. 

Main method header:  
```java
    public static void main(String[] args){
      
    }
```
*protip: just type `psvm` and hit `tab` to autocomplete the main header*

## Print and Println

Inside the main method is where much of our early coding will take place. Later, when we start creating our own classes and objects, we will branch out from this. 

Inside the main method we see a single line of code: 
```java
System.out.println("Hello World");
```

This statement will print "Hello World" to the console. But before we experiment with examples, let's break down exactly what we are seeing.

[**System**](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html) is a class in the Java Library. If we visit the docs *(click the link)* we see that it defines a variable called [**out**](https://docs.oracle.com/javase/8/docs/api/java/lang/System.html#out). You will then notice that ```out``` is defined as a [**PrintStream**](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html) object. In short, this means that from the `System` class, we reference the `out` variable which can execute methods from the `PrintStream` class. 

That may be a lot, but its helpful to understand how Java is organized. But good news, we are only going to focus on two methods in the PrintStream class: [**print**](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#print-java.lang.String-) and [**println**](https://docs.oracle.com/javase/8/docs/api/java/io/PrintStream.html#println-java.lang.String-)

`print()` - Prints the data in parentheses to the console. Does not move cursor to the next line. 

`println()` - Prints the data in parentheses to the console. Includes a new line character and advances the cursor to the next line.

Let's check out how these work in the [Sandbox][sandbox]



[sandbox]: ../L1.java
