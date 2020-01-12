- ArrayList is a class in the java API.
- To put something into an ArrayList, use add()
- To remove something from an ArrayList use remove()
- To find out where something is (and if it is) in an ArrayList, use indexOf().
- To find out if an ArrayList is empty, use isEmpty().
- To get the size (number of elements) is an ArrayList, use the size() method.
- To get the length (number of elements) in a regular old array, remeber, you use the length variable.
- An ArrayList resizes dynamically to what-ever size is needed. It grows when objects are added, and it shrinks when objects are removed. You declare the type of the array using a type parameter, which is a type name in angle brackets. Example: ArrayList<Button> means the ArrayList will be able to hold only objects of type Button (or subclasses of Button as you’ll learn in the next couple of chapters). Although an ArrayList holds objects and not primitives, the compiler will automatically “wrap” (and “unwrap” when you take it out) a primi-tive into an Object, and place that object in the ArrayList instead of the primitive. (More on this feature later in the book.)
- Classes are grouped into packages.
- A class has a full name, which is a combina-tion of the package name and the class name. Class ArrayList is really java.util.ArrayList.
- To use a class in a package other than java.lang, you must tell Java the full name of the class.
- You use either an import statement at the top of your source code, or you can type the full name every place you use the class in your code.
  
Something you can do with Arraylist.
Make one
``` java
ArrayList<Egg> myList = new ArrayList<Egg>();
```
Put something in it.
``` java	
Egg s = new Egg();
myList.add(s);
```

Put another thing in it.
``` java	
Egg b = new Egg();
myList.add(b);
```

Find out how many things are in it.	
``` java
int theSize = myList.size();
```

Find out if it contains something.
``` java
boolean isIn = myList.contain(s);
``` 

Find out where something is (i.e. its index)
``` java	
boolean idx = myList.indexOf(b);
```

Find out if it’s empty
``` java
boolean empty = myList.isEmpty();
```
Remove something from it.
``` java
myList.remove(s);
```

## ArrayList vs Array

- Array's have to know it's size
- To put an object in an array, you have to assign it in a specific location
- Array's have a unique syntax compared to everything else in java
- ArrayList in Java 5.0 are parameterized.

## Boolean Expressions

and = &&

or = ||

not = !

not equals = !=