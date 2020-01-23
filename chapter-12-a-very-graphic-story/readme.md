## Table of Contents 
- Your first GUI 
- Getting a user event 
- Implement a listener interface 
- Getting a button’s ActionEvent 
- Putting graphics on a GUI 
- Fun with paintComponent()
- The Graphics2D object
- Putting more than one button on a screen
- Inner classes to the rescue (make your listener an inner class)
- Animation (move it, paint it, move it, paint it, move it, paint it...)
- Code Kitchen (painting graphics with the beat of the music)
- Exercises and puzzles

## Bullet Points

### Events 
- To make a GUI, start with a window, usually a JFrame:
``` java
    JFrame frame = new JFrame();
```
- You can add widgets (buttons, text fields, etc.) to the
JFrame using:
``` java 
frame.getContentPane().add(button);
```
-  Unlike most other components, the JFrame doesn’t let
you add to it directly, so you must add to the JFrame’s
content pane.
- To make the window (JFrame) display, you must give it
a size and tell it be visible:
``` java 
    frame.setSize(300,300);
    frame.setVisible(true);
```
- To know when the user clicks a button (or takes some
other action on the user interface) you need to listen for
a GUI event.
-  To listen for an event, you must register your interest
with an event source. An event source is the thing
(button, checkbox, etc.) that ‘fires’ an event based on
user interaction.
- The listener interface gives the event source a way
to call you back, because the interface defines the
method(s) the event source will call when an event
happens.
- To register for events with a source, call the source’s
registration method. Registration methods always take
the form of: add<EventType>Listener. To register for a
button’s ActionEvents, for example, call:
``` java 
    button.addActionListener(this);
```
- Implement the listener interface by implementing all of
the interface’s event-handling methods. Put your eventhandling code in the listener call-back method. For
ActionEvents, the method is:
``` java
public void actionPerformed(ActionEvent
                            event) {
        button.setText(“you clicked!”);
 }
```
- The event object passed into the event-handler method
carries information about the event, including the source
of the event.

### Graphics 
-  You can draw 2D graphics directly on to a widget.
-  You can draw a .gif or .jpeg directly on to a widget
-  To draw your own graphics (including a .gif or
.jpeg), make a subclass of JPanel and override the
paintComponent() method.
- The paintComponent() method is called by the GUI
system. YOU NEVER CALL IT YOURSELF. The
argument to paintComponent() is a Graphics object that
gives you a surface to draw on, which will end up on
the screen. You cannot construct that object yourself
- Typical methods to call on a Graphics object (the
paintComponent paramenter) are:
``` java
g.setColor(Color.blue);
g.fillRect(20,50,100,120);
```
- To draw a .jpg, construct an Image using:
``` java
Image image = new ImageIcon(“catzilla.jpg”).getImage();
```
- and draw the image using:
``` java
g.drawImage(image,3,4,this);
```
-  The object referenced by the Graphics parameter
to paintComponent() is actually an instance of the
Graphics2D class. The Graphics 2D class has a variety
of methods including:
fill3DRect(), draw3DRect(), rotate(), scale(), shear(),
transform()

- To invoke the Graphics2D methods, you must cast the
parameter from a Graphics object to a Graphics2D
object:
``` java
Graphics2D g2d = (Graphics2D) g; 
```