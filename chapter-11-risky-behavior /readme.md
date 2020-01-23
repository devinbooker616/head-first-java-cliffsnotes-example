## Table of Contents
- Making a music machine (the BeatBox) 
- What if you need to call risky code? 
- Exceptions say “something bad may have happened...” 
- The compiler guarantees (it checks) that you’re aware of the risks 
- Catching exceptions using a try/catch (skateboarder) 
- Flow control in try/catch blocks 
- The finally block (no matter what happens, turn off the oven!) 
- Catching multiple exceptions (the order matters) 
- Declaring an exception (just duck it) 
- Handle or declare law 
- Code Kitchen (making sounds) 
- Exercises and puzzles

## Bullet Points 

- A method can throw an exception when something fails at runtime
- An exception is always an object of type Exception. (Which, as you
remember from the polymorphism chapters means the object is from a
class that has Exception somewhere up its inheritance tree.)  
- The compiler does NOT pay attention to exceptions that are of
type RuntimeException. A RuntimeException does not have to be
declared or wrapped in a try/catch (although you’re free to do either or
both of those things)
- All Exceptions the compiler cares about are called ‘checked
exceptions’ which really means compiler-checked exceptions. Only
RuntimeExceptions are excluded from compiler checking. All other
exceptions must be acknowledged in your code, according to the
rules.
- A method throws an exception with the keyword throw, followed by
a new exception object:

``` java
throw new NoCaffeineException();
```
- Methods that might throw a checked exception must announce it with
a throws Exception declaration.
- If your code calls a checked-exception-throwing method, it must
reassure the compiler that precautions have been taken. 
- If you’re prepared to handle the exception, wrap the call in a try/catch,
and put your exception handling/recovery code in the catch block
- If you’re not prepared to handle the exception, you can still make the
compiler happy by officially ‘ducking’ the exception. We’ll talk about
ducking a little later in this chapter.

## Flow Control in try/catch block
- Take the example of the below code.
``` java 
  try{
    Foo f = x.doRiskyThing();
    int b = f.getNum();
  }catch (Exception e){
    System.out.println("Failed.");
}
System.out.println("We made it.");
```
- If the try SUCCEEDS, the Catch block is not executed, and Last Sysout is printed.
- If the Try fails, the rest of the try block never runs, and both the Sysout is printed.

## Finally 

- A finally block is where you put code that must run regardless of an exception.
``` java 
    try{
        turnOvenOn();
        x.bake();
    }catch (BakingException ex){
        ex.printStacktrace();
    }finally{
    turnOvenOff();
    }
```
- A finally block lets you put all your import cleanup code in one place instead of duplicating it.
- If the try or catch block has a return statement, finally will still run.

## Exceptions rules 

- You cannot have a catch or finally without a try.
- You cannot put code between the try and the catch.
- A try MUST be followed by either a catch or finally.
- A try with only a finally(no catch) must still declare the exception.