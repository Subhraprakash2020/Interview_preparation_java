package Java_8_feature.Functional_interface;

interface Animal{
    void eat();
    default void running(){
        System.out.println("Animals are running");
    }
}

class Cat implements Animal{
    public void eat(){
        System.out.println("Cat is eating");
    }
}

public class DefaultMethod {
    public static void main(String[] args) {
        Animal a = new Cat();
        a.eat();
        a.running();
    }
}
