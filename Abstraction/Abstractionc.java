package Abstraction;

abstract class Animal{
    abstract void sound();// abstract method
    void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog barks");
    }
}

public class Abstractionc {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        a.eat();
    }
}

// Rules of creating of abstract class.
// Cannot create object.
// Must overriden abstract method in clild class.
// Can have constructor.
// Can have static method.
// Can have final method.