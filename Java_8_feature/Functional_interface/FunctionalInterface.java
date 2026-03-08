package Java_8_feature.Functional_interface;

interface Demo{
    void display();
}

public class FunctionalInterface {
    public static void main(String[] args) {
        Demo d = () -> System.out.println("Hello java");
        d.display();
    }
}
