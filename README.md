# Designe Patterns
 - Desing Patterns are reusable solutions to common problems in software design. They are not specific to any programming language and can be applied in various contexts.
 - They provide a way to structure code in a way that is maintainable, scalable, and easy to understand.
 - There are three main categories of design patterns: Creational, Structural, and Behavioral.
  ## Creational
   - The designe pattern that deal with the creation of an object.
  ## Structural
   - It deal with the class structure such as Inheritance and Composition.
  ## Behavioral
   - Provide solutions for the better interaction between object, promoting loose coupling and flexibility to extendly easily in future.

There are 5 designe patter.

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