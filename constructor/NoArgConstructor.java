package constructor;
// A constructot with no parameter created by programmer.
class Student2{
    int id;
    String name;
    //No argument passed here
    Student2(){
        id = 100;
        name = "Subhra";
    }

    void display(){
        System.out.println(id + " "+ name);
    }
}
public class NoArgConstructor {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.display();
        System.out.println(s.id);
    }
}
