package Access_modifier.Private;

class StudentPrivate{
    private int id;

    public void setId(int id){
        this.id = id;
    }

    public void display(){
        System.out.println("This is a private method"+id);
    }
}

public class PrivateAccessModifier {
    public static void main(String[] args) {
        StudentPrivate sp = new StudentPrivate();
        // sp.id = 10;//Private variable cannot be access directly.
        sp.setId(10);
        sp.display();
    }
}


// 🔹 When to Use?

// ✔ For data hiding
// ✔ To protect sensitive data
// ✔ In encapsulation

// 👉 Mostly used for variables.