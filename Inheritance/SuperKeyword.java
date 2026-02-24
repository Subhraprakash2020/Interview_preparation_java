package Inheritance;

class Parent{
    int x = 10;
    void showParent(){
        System.out.println("Parent method");
    }

    Parent(){
        System.err.println("Parent class constructot");
    }
}

class Child extends Parent{
    int x = 20;
    void show(){
        System.out.println(super.x);// Access parent variable
        System.out.println(x);
        super.showParent();// Call parent method
    }
    Child(){
        super();// Call parent class constructot.
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
