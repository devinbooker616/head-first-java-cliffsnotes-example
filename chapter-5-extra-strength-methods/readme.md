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
- Integer.ParaseInt() works only if the string represents a digit (“0”, “1”, “2”, etc)
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
## Math.random()
Math. random() is used to return a pseudorandom double type number greater than or equal to 0.0 and less than 1.0.
``` java 
int randomNum = (int) (Math.random() * 5); ///random number being multiplied by 5
```

## Casting 
In chapter 3 we talked about the sizes of the various primitives, and how you
can’t shove a big thing directly into a small thing:
``` java 
long y = 42;
int x = y; // won’t compile
```
A long is bigger than an int and the compiler can’t be sure where that long has
been. It might have been out drinking with the other longs, and taking on really
big values. To force the compiler to jam the value of a bigger primitive variable
into a smaller one, you can use the cast operator. It looks like this:
``` java 
long y = 42; // so far so good
int x = (int) y; // x = 42 cool!
```
Putting in the cast tells the compiler to take the value of y, chop it down to int
size, and set x equal to whatever is left. If the value of y was bigger than the
maximum value of x, then what’s left will be a weird (but calculable*) number:
``` java 
long y = 40002;
// 40002 exceeds the 16-bit limit of a short
short x = (short) y; // x now equals -25534!
```
Still, the point is that the compiler lets you do it. And let’s say you have a floating point number, and you just want to get at the whole number (int) part of it:
``` java 
float f = 3.14f;
int x = (int) f; // x will equal 3
```
 And don’t even think about casting anything to a boolean or vice versa—just
walk away

## Questions 
- How do you run a test on something that doesn't exist? (You don't)
- Why not wait till the code is written then use the test? (writing tests help clarify your thoughts)
- what does getUserInput() do? (Get the user's input)