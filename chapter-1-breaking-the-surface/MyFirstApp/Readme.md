Table of Contents 

- The Way Java works
- Code Structure in java
- Anatomy of a class
- The Main() method
- Looping
- Conditional branching (if tests)
- Coding the "99 bottles of beer" app
- Phrase-o-matic
- Fireside chat: compiler vs JVM
- Exercises and puzzles

The Way Java works:

What you'll do in Java is  

1) Type your source code

2) Compile the Code 

3) Run the compiled code in a virtual machine 

The version of Java (Java 1, Java 2, Java 5, etc) is named by the second number in the version (Java 1 is Java 1.1, Java 2 is Java 1.2 and higher, and Java 5 is Java 1.5 and higher). Each version is dramatically different and faster than one before last. 

Code Structure in Java:

What goes in a SOURCE file?

A source code file (with the .java extension) holds one class definition. The class represents a piece of your program, although a very tiny application might need just a single class. The class must go within a pair of curly braces 

    public class dog // class
    {
    
    
    }

What goes in CLASS?

A class has one or more methods. In the dog class, the bark method will hold instructions for how the Dog should bark. Your methods must be declared INSIDE a class 

    public class dog 
    {
    	void bark() //method
    	{
    
    	}
    }

What goes in a METHOD?

 Within the curly braces of a method, write your instructions for how the method should be performed. Method code is basically a set of statements, and for now you can think of a method of like a function or procedure (For people more familiar with languages like python, at the base level it is essentially a user-made function) 

    public class dog
    {
    	void bark() {
    			//statements
    			statement 1;
    			statement 2;
    	}
    }

Anatomy of a class:

When the JMV (Java Virtual Machine) it looks for the class you give it at the command line. Then it starts looking for a specifically-written method that looks exactly like 

    public static void main (String[] args) {
    	// your code goes here
    }

Next the JMV runs everything between the curly braces of the main method and every Java app has to have at least one class and at least one method(to clarify further you will have one main per application not one main per class).

    package app;
    
    
    public class App {
    //public means everyone can use it 
    //class makes it a class
    //app 
        public static void main(String[] args) throws Exception {
            System.out.println("I rule");
        }
    }

While Loops:

Java has three standard looping constructs: while, do while, and for, but for this chapter we're just gonna focus on While loops. 

A loop block is bounded by a pair of curly braces and so long as the condition is true you do everything inside of the loop  block. 

You can do a simple boolean test by checking the value of a variable, using a comparison operator like < (less than), > (greater than), and == (equal to)

    int x = 4; //assign 4 to x
    
    while (x > 3) {
    	// loop will run because x is greater than 3 
    	x = x - 1 // if this wasn't here the loop would run forever because x will alwasy be greater than 3
    }

Conditional branching: 

In Java, an if test is basically the same as the boolean test in a while loop - except instead of saying, "while there's still no beer..." you'll say "if there's still beer"

    class IfTest {
    	public static void main (String[] args) {
    		int x = 3;
    		if (x == 3) {
    				System.out.println("x must be 3");
    		}
    	}
    }

What is a statement? 

- declaration, assignment, method calls

What is a loop?

- loops: for and while

What is branching? 

- if/else tests