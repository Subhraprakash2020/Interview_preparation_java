package Access_modifier.Public;

public class PublicAccessModifier {
    public int id;

    public void display(){
        System.out.println("This is a public class");
    }

    public static void main(String[] args) {
        PublicAccessModifier p1 = new PublicAccessModifier();
        p1.display();
    }
}

// Public class accessible every where.
// Why to use?
// When class/method should be accessable everywhere.
// For API method , for main method.
