package Inheritance;

class Fruit{
    void color(){
        System.out.println("Different color fruit is there");
    }
}

class Apple extends Fruit{
    void Acolor(){
        System.out.println("Apple is red in color");
    }
}

class Orange extends Fruit{
    void Ocolor(){
        System.out.println("Orange is orance in color");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args) {
        Apple a = new Apple();
        Orange o = new Orange();
        a.Acolor();
        a.color();
        o.Ocolor();
        o.color();
    }
}

// When mulitple classes share common behavior.