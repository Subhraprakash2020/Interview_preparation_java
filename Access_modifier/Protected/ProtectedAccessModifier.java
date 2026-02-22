package Access_modifier.Protected;

class Parent{
    protected void show(){
        System.out.println("Protected method");
    }
}

class Child extends Parent{
    void display(){
        show();
    }
}
public class ProtectedAccessModifier {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}


// ✅ Accessible:

// Same class

// Same package

// Subclass (even in different package)

// 🔹 When to Use?

// ✔ Mainly used in inheritance
// ✔ When child class needs access