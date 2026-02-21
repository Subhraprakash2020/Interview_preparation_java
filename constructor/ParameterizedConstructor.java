// Constructor with parameters to initialize value.
package constructor;

class Animal{
    String name;
    String color;
    
    //Parameterized constructor
    Animal(String n, String c){
        name = n;
        color = c;
    }

    void display(){
        System.out.println("Animal name is "+name+" and color is "+color);
    }
}

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Animal an = new Animal("cat", "White");
        an.display();
        System.out.println(an.color +" and "+an.name);

    }
}
