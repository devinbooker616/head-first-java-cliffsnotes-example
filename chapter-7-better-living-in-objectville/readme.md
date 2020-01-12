- A subclass extends a superclass.
- A subclass inherits all public instance variables and methods of the superclass but does not inherit the private instance variables and methods of the superclass.
- Inherited methods can be overridden; instance variables cannot be overridden (although they can be redefined in the subclass, but that’s not the same thing, and there’s almost never a need to do it.)
- Use the IS-A test to verify that your inheritance hierarchy is valid. If X extends Y, then X IS-A Y must make sense.
- The IS-A relationship works in only one direction. A Hippo is an Animal, but not all Animals are Hippos. When a method is overridden in a subclass, and that method is invoked on an instance of the subclass, the overridden version of the method is called. (The lowest one wins.)
- If class B extends A, and C extends B, class B IS-A class A, and class C IS-A class B, and class C also IS-A class A.

## Rules of Overriding

- Arguments must be the same, and return types must be compatible.
- The method can’t be less accessible

## Overloading a method

- The return types can be different.
- You can’t change ONLY the return type.
- You can vary the access levels in any direction.