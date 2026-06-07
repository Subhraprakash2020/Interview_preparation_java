1. class : Class is the blue print of the object.(car, animal)
object : Object are the real world entity(ferrari, audi)

2. This and super
this: this refers to the current object of the class.

class Student{
    String name;
    student(String name){
        this.name = name;
    }
}

super: super refers to the parent class object.

class Animal{
    String name;
}

class Dog extends Animal{
    void show(){
        super.name;
    }
}

3. Polymorphism

Poly means many and morphism means form, in java one object can beheave differently called polymorphism.
There are 2 type of polymorphism
Compile time polymorphism(method overloading):
In compile time polymorphism have same method name but different parameter is there.
class Student{
    student(int id, String name){

    }
    student(int mark){

    }
}

Runtime polymorphism(method overriding)
In runtime polymorphism method name and parameter are same but in child class implementation it own.

class Animal{
    void bark(){
        sysout(Dog is barking);
    }
}

class Sount extends Animal{
    void bark(){
        sysout(Do is barking larger that cat)
    }
}

4. Abstraction

In abstraction means hiding implementation details and show only the essential part to the user.

we can achived abstraction using abstraction class and using interface.

abstract class vehivle{
    abstract void start();

    void fuel(){
        sysout("");
    }
}

Interface : An interface is a blue print that contains only abstract method and use to achive 100% abstraction

interface Animal{
    void sound();
}

class Dog implements Animal{
    public void sound(){
        sysout();
    }
}

Difference between Abstraction and Interface
Abstraction
---------------
A class having abstract keywork having abstract and non abstract body.
Use to share common code and behaviour among releated class.
can be instance or static.
Initialization is optional

Interface
------------------
A completely abstract type that define a contract for class to implement.
Use to define a contract that multiple unreleated class can implement.
Always public static final
Must be initialized immediately.