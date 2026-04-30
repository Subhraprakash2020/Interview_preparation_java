# Design Patterns
 - Desing Patterns are reusable solutions to common problems in software design. They are not specific to any programming language and can be applied in various contexts.
 - They provide a way to structure code in a way that is maintainable, scalable, and easy to understand.
 - There are three main categories of design patterns: Creational, Structural, and Behavioral.
  ## Creational
   - The design pattern that deal with the creation of an object.
  ## Structural
   - It deal with the class structure such as Inheritance and Composition.
  ## Behavioral
   - Provide solutions for the better interaction between object, promoting loose coupling and flexibility to extendly easily in future.

There are 5 design pattern.

# Singleton
 - Singleton patter restrict the instantiation of a class and ensure that only one instance of  the class exists in JVM.
 - It must provide a global access point to get the instance of the class.
 - It is used for logging, thread pool, drivers object, caching.
 - Also used in Abstract factory, Builder, Prototype, Facade etc.
 - It is use core java class (for e.g.: java.lang.Runtime, java.awt.Desktop).

# Singleton Pattern Implementation
 - Private constructor to restrict instantiation of the class from other classes.
 - Private static variable of the same class that is the only instance of the class.
 - Public static method that return the instance of the class, this is the global access  point for outer world to get the instance of the Singleton class.

 Public class ThreadSafeSingleton{
    private static ThreadSafeSingleton instance;
    private ThreadSafeSingleton(){}
    public static synchronized ThreadSafeSingleton getinstance(){
        if(instance == null){
            instance = new ThreadsafeSingleton;
        }
        return instance;
    }
 }

# Factory Design pattern
 - In factory design patter is used when we have super class with multiple sub class and based on input, we need to return one of the sub-class.

# Factory Design pattern Advantages
 - It provide approach to code for interface rather that implementation.
 - Factory pattern provides abstraction between implementation and client classes through inheritance.

    interface Shape {
        void draw();
    }

    class Circle implements Shape {
        public void draw() {
            System.out.println("Drawing Circle");
        }
    }
 
    class Rectangle implements Shape {
        public void draw() {
            System.out.println("Drawing Rectangle");
        }
    }

    class ShapeFactory {
        public Shape getShape(String type) {
            if (type == null) return null;

            if (type.equalsIgnoreCase("CIRCLE")) {
                return new Circle();
            } else if (type.equalsIgnoreCase("RECTANGLE")) {
                return new Rectangle();
            }

            return null;
        }
    }

    public class Main {
        public static void main(String[] args) {
            ShapeFactory factory = new ShapeFactory();

            Shape shape1 = factory.getShape("CIRCLE");
            shape1.draw();

            Shape shape2 = factory.getShape("RECTANGLE");
            shape2.draw();
        }
    }


# Abstract factory design pattern
 - The abstract factory design pattern is a creational pattern that provides an interface to create families of related object without specifying concrete classes.

 - In simple : factory create one product, abstracted factory create a group of releated product.

 - It provides approach to code for interface rather than implementation.

 Light Theme → Light Button, Light TextBox
 Dark Theme → Dark Button, Dark TextBox


# Builder design pattern
 - The builder design pattern is a creational pattern used to construct complex object step by step.
 - In simple : Insted of passing a lot of parameter to a constructor , you build the object gredually.

  When use builder pattern
  - Object has many fields/parameter.
  - Some fields are optional.
  - readble and clean object creation.

  e.g:
  class User {
    private String name;
    private int age;
    private String email;
    private String phone;

    private User(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.phone = builder.phone;
    }

    public static class Builder {
        private String name;
        private int age;
        private String email;
        private String phone;
    }
  }

# Prototype design pattern
 - The prototype design pattern is a creational pattern used to create new object by copying an existing object, insted of creating them from scratch.

 Shallow copy : Copies object but reference are shared, faster but riskey.
 user2.address = user1.address;

 Deep copy : Copies object and all nested object.
 user2.address = new Address(user1.address.city);

# Structural Design pattern

# Adapter design pattern
 - The adapter design pattern is a structural pattern that allows two incompatible interfaces to work together.

 - It acts like a bridge between 2 difference system.

 Use it when:
    You want to use an existing class, but its interface doesn’t match your needs
    You want to connect incompatible systems
    You want to reuse old/legacy code

# Composite design pattern
 - The composite design pattern is a structural pattern that you treated individiual object or group object in same way. 