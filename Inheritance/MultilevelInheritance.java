package Inheritance;

class Bird{
    void eat(){
        System.out.println("Bird is eating");
    }
}

class Crow extends Bird{
    void color(){
        System.out.println("Crow is black in color");
    }
}

class Parrot extends Crow{
    void fly(){
        System.out.println("Parrow is flying");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        Parrot p = new Parrot();
        p.eat();
        p.color();
        p.fly();
    }
}


// When hierarchy is multilevel we use multilevel inheritance.