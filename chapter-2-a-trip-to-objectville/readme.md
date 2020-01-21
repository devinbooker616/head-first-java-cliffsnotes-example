Table of Contents

Chair Wars (Brad the OO guy vs. Larry the procedural guy) 

Inheritance (an introduction) 

Overriding methods (an introduction) 

What’s in a class? (methods, instance variables) 

Making your first object 

Using main() 

Guessing Game code 

Exercises and puzzles

So in this chapter, we're going to look at what makes object-oriented (OO) development in Java so much fun. We'll look at the difference between a class and an object. Other things will be covered as well. 

## When you design a class, think about the objects that will be created from that class type. Think about:

- things the object knows
- things the object does

    ShoppingCart 
    ``` java
    //knows 
    cartContents
    
    //does
    addToCart() 
    removeFromCart()
    checkOut()
    
    Button 
    
    //knows 
    label
    color 
    
    //does 
    setColor()
    setLabel()
    dePress()
    unDepress()
    
    Alarm 
    
    //knows
    alarmTime
    alarmMode
    
    //does
    setAlarmTime()
    getAlarmTime()
    isAlarmSet()
    snooze()
```
Things an object knows about itself are called

- instance Variables

Things an object can do are called 

- methods
    Song 
    
    //instance variables(state) 
    //knows
    title 
    artist 
    
    //methods(behavior)
    //does
    setTitle()
    setArtist()
    play()

Things an object knows about itself are called instance variables. They represent an object's state(the data), and can have unique values for each object of that type. Instance is another way of saying object. 

Things an object can do are called methods. When you make an object think about the data an object will need to know about itself, the methods will operate on that data. It's common for an object to have methods that read or write the values of the instance variables 

Objects have instance variables and methods, but those instance variables and methods are designed as apart of the class. 

REMEMBER: A class is not an object but it's used to the construct them. 

## Making your first object

So what does it take to create and use an object? You need two classes. One class for the type of object you want to use and another class to test your new class. The tester class is where you put the main() method where you create and access objects of your new class type

### 1) Write your class
``` java
    class Dog {
    	//instance variables 
    	int size; 
    	String breed;
    	String name; 
    	
    	//a method
    	void bark() {
    		System.out.println("Ruff! Ruff!");
    	}
    }
```
### 2) Write a test (TestDrive) class
``` java
    class DogTestDrive {
    	//just a main method
    	public static void main (String[] args) {
    		//Dog test code goes here 
    	}
    }
```
### 3) In your tester, make an object and access the object's variables and methods
``` java
    class DogTestDrive {
    	public static void main (String[] args) {
    		Dog d = new Dog(); //make a dog object 
    		// . = dot operator 
    		d.size = 40; //use the dot operator to set the size of the dog
    		d.bark(); // and to call its bark method 
    	}
    }
```
For a true OO application you need objects talking to other objects, as opposed to a static main method creating and testing objects.

## The two uses of main:

- to test your real class
- to launch/start your java application

## Questions:

- What are the fundamental things you need to think about when you design a java class?
- What are the questions you need to ask yourself?
- If you could design a checklist to use when you're designing class, what would be the checklist?