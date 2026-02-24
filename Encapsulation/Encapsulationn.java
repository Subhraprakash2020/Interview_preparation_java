package Encapsulation;

class Student{
    private int id;
    private String name;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}

public class Encapsulationn {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(10);
        s.setName("Subhra");
        System.out.println(s.getId());
        System.out.println(s.getName());
    }
}
