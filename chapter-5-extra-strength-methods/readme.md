## Table of Contents
- Building the Sink a Dot Com game 
- Starting with the Simple Dot Com game (a simpler version) 
- Writing prepcode (pseudocode for the game) 
- Test code for Simple Dot Com 
- Coding the Simple Dot Com game 
- Final code for Simple Dot Com 
- Generating random numbers with Math.random() 
- Ready-bake code for getting user input from the command-line 
- Looping with for loops                                                                          
- Casting primitives from a large size to a smaller size 
- Converting a String to an int with Integer.parseInt() 
- Exercises and puzzles

## Bullet Points

- Your java should start with a high-level design
- typically you’ll write three things you when you create a new class:
    - Prepcode
    - Testcode
    - Real code
- prepcode should describe what to do, not how to do it. Implementation comes later.
- use the prepcode to help design the test code.
- write test code before you implement the methods
- choose for loops over while loops when you know how many times you want to repeat the loop code
- Use the pre/post increment operator to add 1 to a variable (x++) and for decrement use (x++)
- Use Integer.ParseInt() to get the int value of a string
- Integer.ParaeInt() works only if the string represents a digit (“0”, “1”, “2”, etc)
- use break to leave a loop early (I.e, if the Boolean test condition is true

## For Loops

### Regular (non-enhance for loops)
``` java
    for(int i =0; i < 100; i++)
```
1) Initialize 
```java
    int i = o;
```
2) Boolean Test
``` java
    i < 100;
```
3) Iteration expression 
``` java 
    i++;
```
### Enhanced for loops
``` java
    for (String name: nameArray) {}
```
1) Iteration variable declaration 
``` java 
    String name
```
2) the actual collection 
``` java 
    nameArray
```

## Questions 
- How do you run a test on something that doesn't exist? (You don't)
- Why not wait till the code is written then use the test? (writing tests help clarify your thoughts)
- what does getUserInput() do? (Get the user's input)