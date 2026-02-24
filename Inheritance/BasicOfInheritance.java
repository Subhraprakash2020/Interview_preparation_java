package Inheritance;

class Animal{
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking");
    }
}

public class BasicOfInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
}

// What is Inheritance?
// Inheritance is a mechanism where one class acquire all the property of another class.


// Why use Inheritance?
// Use of code reuseability.
// Method overriding.
// Maintainability.

// Above example aslo Single inheritance.
// When there is IS-A relationshipt we use single inheritance.