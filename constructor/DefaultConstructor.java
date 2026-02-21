package constructor;
// A Constructor is a special type of method that is used to initialize an object when it is created.

class Student {
    int id;
    String name;
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Student s = new Student();//default constructor is called.
        System.out.println(s.id);
        System.out.println(s.name);
    }
}
