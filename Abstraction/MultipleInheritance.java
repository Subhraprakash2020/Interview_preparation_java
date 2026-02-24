package Abstraction;

interface A{
    void show();
}

interface B{
    void disply();
}

class C implements A,B{
    public void show(){
        System.out.println("Show method");
    }

    public void disply(){
        System.out.println("Display method");
    }
}

public class MultipleInheritance {
    public static void main(String[] args) {
        C c = new C();
        c.disply();
        c.show();
    }
}
