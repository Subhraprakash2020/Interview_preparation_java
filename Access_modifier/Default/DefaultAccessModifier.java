package Access_modifier.Default;

class StudentDefault{
    int id;
    void display(){
        System.out.println("This is default access modifier"+id);
    }
}
public class DefaultAccessModifier {
    public static void main(String[] args) {
        StudentDefault sd = new StudentDefault();
        sd.id = 10;
        sd.display();
    }
}


// ✅ Accessible:

// Within same class

// Within same package

// ❌ Not Accessible:

// Outside package

// 🔹 When to Use?

// ✔ When classes are used only inside same package
// ✔ Package-level access