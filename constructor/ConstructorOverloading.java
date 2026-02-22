package constructor;

class StudentOverload{
    int id;
    String name;

    StudentOverload(){
        id = 0;
        name = "subhra";
    }

    StudentOverload(int id){
        this.id = id;
    }

    StudentOverload(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println(id + " "+name);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        StudentOverload so = new StudentOverload();
        StudentOverload so1 = new StudentOverload(100);
        StudentOverload so2 = new StudentOverload(101, "virat");
        so.display();
        so1.display();
        so2.display();
    }
}
