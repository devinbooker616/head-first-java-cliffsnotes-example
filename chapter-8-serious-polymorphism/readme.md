## Table of Contents

- Some classes just should not be instantiated 
- Abstract classes (can’t be instantiated) 
- Abstract methods (must be implemented) 
- Polymorphism in action 
- Class Object (the ultimate superclass of everything) 
- Taking objects out of an ArrayList (they come out as type Object) 
- Compiler checks the reference type (before letting you call a method) 
- Get in touch with your inner object 
- Polymorphic references 
- Casting an object reference (moving lower on the inheritance tree) 
- Deadly Diamond of Death (multiple inheritance problem) 
- Using interfaces (the best solution!) 224
- Exercises and puzzles 230




## Bullet Points

- When you don’t want a class to be instantiated (in other words, you don’t want anyone to make a new object of that class type) mark the class with the abstract keyword.
- An abstract class can have both abstract and non-abstract methods.
- If a class has even one abstract method, the class must be marked abstract.
- An abstract method has nobody, and the declaration ends with a semicolon (no curly braces).
- All abstract methods must be implemented in the first concrete subclass in the inheritance tree.
- Every class in Java is either a direct or indirect subclass of class Object (java.lang.Object).
- Methods can be declared with Object arguments and/or return types.
- You can call methods on an object only if the methods are in the class (or interface) used as the reference variable type, regardless of the actual object type. So, a reference variable of type Object can be used only to call methods defined in class Object, regardless of the type of the object to which the reference refers.
- A reference variable of type Object can’t be assigned to any other reference type without a cast. A cast can be used to assign a reference variable of one type to a reference variable of a subtype, but at runtime, the cast will fail if the object on the heap is NOT of a type compatible with the cast. Example: 
``` java 
- Dog d = (Dog) x.getObject(aDog); 
```
- All objects come out of an ArrayList<Object> as type Object (meaning, they can be referenced only by an Object reference variable, unless you use a cast).
- Multiple inheritance is not allowed in Java, because of the problems associated with the “Deadly Diamond of Death”. That means you can extend only one class (i.e. you can have only one immediate superclass).
- An interface is like a 100% pure abstract class. It defines only abstract methods.
- Create an interface using the interface keyword instead of the word class.
- Implement an interface using the keyword implements Example: Dog implements Pet
- Your class can implement multiple interfaces.
- A class that implements an interface must implement all the methods of the interface, since all interface methods are implicitly public and abstract.
- To invoke the superclass version of a method from a subclass that’s overridden the method, use the super keyword. Example: super.runReport();

## Making and implementing the pet interface 
``` java 
public interface Pet {
    public abstract void beFriendly();

     public abstract void play();

public class Dog extends Canine implements Pet {
    public void beFriendly() {methods have to go here }

    public void play() {methods have to go here}

    public void roam() {normal overriding method}

    public void roam() {normal overriding method}
}

}