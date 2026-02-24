package Inheritance;

class Engine{
    void start(){
        System.out.println("Engine starts");
    }
}

class Car{
    private Engine engine;
    Car(){
        engine = new Engine();
    }

    void drive(){
        engine.start();
        System.out.println("Car is moving");
    }
}

public class HAS_A_relation {
    public static void main(String[] args) {
        Car c = new Car();
        c.drive();
    }
}
