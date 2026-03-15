package DesignePattern;

class Student implements Cloneable{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}

public class ProtoType {
    public static void main(String[] args) {
        Student s1 = new Student(1, "john");
        System.out.println(s1.name);
    }
}
