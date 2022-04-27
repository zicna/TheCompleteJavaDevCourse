# Lambdas
Lambdas are shortcuts to defining the implementation of an abstract method from a functional interface. 
___
use with other files in this folder 
___

## Lambdas and functional programming

The downside of OOP-object with fields that can be altered with methods is prone to errors and hard to debug. 
The upside of functions - takes one (or more args) to generate another value without changing entered values. No matter how many times we perform this function with the same arguments it will produce the same results.

In functional languages (`Ruby`, `JavaScript`, `Scala`, `Closure`) we can do: 
1. Assign function to a value- function expression
2. Pass function as an argument to another function- callback function
3. Define function inside another function- function scope
4. Return function from another function call

In `JavaScript`, functions are first-class objects.
Pure functions - with the same arguments always return the same result and the application of a function has no side effects. 

___
## Lambda expression

Lambdas are **anonymus function** that can:
1. assign to variable 
2. pass an argument to another function (since Java 8 version)
3. return from method


Lambdas in Java can be used only with certain types of interfaces- functional interfaces.

Functional Interface in Java is an interface that only contains one abstract method. In addition to this one abstract method, the functional interface can contain default and static method which do have implementation along with abstract one that does NOT have implementation. 

We can add annotation `@FunctionalInterface` above (not obligatory but it is considered best practice). And the compiler will enforce that we have exactly one abstract method.

If we want to implement lambdas with interfaces with more than one abstract method we would need to use the `Anonymus class`. 



Instead of:

1. passing an object as an argument to a function
2. call the method of the object passed
3. 
We do:
1. pass an implementation of that method directly as an argument in the function. 


When we pass lambdas into function as arguments:

1. access level is not needed (public, private, protected)
2. the name of the method is not needed
3. the return type is not needed (the compiler will figure it out automatically)
4. we add an arrow operator (->),  after ()


Since we pass the implementation of a method as an object in the function we can assign that method to a variable as we would do with any other object. (`file Main.java; lines: 18. and 22.`)
___
## Short the lambda

**Parentheses:**

1. if we have only one parameter we can omit parentheses 
2. if we have no parameters or more than one we need parentheses
   
**One line lambdas: (one line implementation)**

1. omit curly braces 
2. omit return keyword (even if we have return value)
3. put everything in the same line 

