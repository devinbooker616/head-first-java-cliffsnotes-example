

## There are two types of Variables

- primitive: Holds fundamental values like integers, booleans, and floating point numbers.
- object references: This holds references to objects

## Declaring a variable

Java cares about the type. For the type-safety to work you have to declare the type of whatever variable you're trying to use.

## Declaration rules

There are only two declaration rules which are: 

- variables must have a type
- variables must have a name

    int x;
    x = 234;
    byte b = 89;
    boolean isFun = true;
    double d = 3456.98;
    char c = 'f';
    int z = x;
    boolean isPunkRock;
    isPunkRock = false;
    boolean powerOn;
    powerOn = isFun;
    long big = 3456789;
    float f = 32.5f;//Gotta have the f with the float or java will think it's a double

## Three rules

- It must start with a letter, underscore (_), or dollar sign ($). You can’t start a name with a number.
- After the first character, you can use numbers as well. Just don’t start it with a number.
- It can be anything you like, subject to those two rules, just so long as it isn’t one of Java’s reserved words.

## Controlling your object

- There is actually no such thing as an object variable.
- There’s only an object reference variable.
- An object reference variable holds bits that represent a way to access an object.

## Arrays

Arrays give you fast random access by letting you use an index position to get to any element in the array 

1) Declare an int array variable. An array variable is a remote control to an array object
 
``` java
    int [] nums;
```
2) Create a new int array with a length of 7, and assign it to the previously declared int[] variable nums
   
```java
    nums = new int[7];
```
3) Give each element in the array an int value. Remember, elements in an int array are just int variables. 
```java
    nums[0] = 6;
    nums[1] = 19;
    nums[2] = 44;
    nums[3] = 42;
    nums[4] = 10;
    nums[5] = 20;
    nums[6] = 1;
```
## Tables for primitive types:

| Type    | Bit Depth    | Value Range               |
|---------|--------------|---------------------------|
| boolean | JVM Specific | true/false                |
| char    | 16 bits      | 0 to 65535                |
| byte    | 8 bits       | -128 to 127               |
| short   | 16 bits      | -32768 to 32767           |
| int     | 32 bits      | -2147483648 to 2147483647 |
| long    | 64 bits      | huge to huge              |
| float   | 32 bits      | varies                    |
| double  | 64 bits      | varies                    |

## questions

- what are the declaration rules (variable must have name and type)
- what are at least 3 primitive types (integers, booleans, and floating point numbers)
- There is actually no such thing as a....?(object variable
