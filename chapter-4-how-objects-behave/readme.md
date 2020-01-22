## Table of Contents
-Methods use object state (bark different) 
-Method arguments and return types 
-Pass-by-value (the variable is always copied)                                                 -Getters and Setters 
-Encapsulation (do it or risk humiliation) 
-Using references in an array 
-Exercises and puzzles 

## Bullet Points

- Classes define what an object knows and what an object does.
- Things an object knows are its instance variables (states).
- Things an object does are its methods(behavior).
- Methods can use instance variables so that objects of the same type can behave differently.
- A method can have parameters, which means you  can pass one or more values in to the method.
- The number and type of values you pass in must match the order and type of the parameters declared by the method.
- Values passed in and out of methods can be implicitly promoted to a larger type or explicitly to a larger type or explicitly cast to a smaller type.
- The value you pass as an argument to a method can be a literal value (2, 'c', etc) or variable of the declared parameter type (for example, x where x is an int variable). (There are other things you can pass as arguments.)
- A method must declare a return type. A void return type means the method doesn't return anything.
- If a method declares a non-void return type, it must return a value compatible wit the declared return type.

## Encapsulation

- In encapsulation the instance variable should be hidden by the use of private access modifiers.
- The instance variables can only be accessed using a getter or a setter method with public access modifiers.

## Instance and local variables

- Instance variables can only be declared inside the class but not within the method of that class
- Local variables are declared inside a method and has to be initialized to be used

## Comparing variables

- Use == to compare two primitives, or to see if two references refer to the same object.
- Use the equals() method to see if two different objects are equal.

## Questions 

- Methods can return (values)
- Methods ca have how many parameters? (Multiple)
- Java is (Pass-by-value) which means? (Pass-by-copy)