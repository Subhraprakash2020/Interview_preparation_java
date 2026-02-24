package Polymorphism;

class Calculator{
    int add(int a, int b){
        return a+b;
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
}


public class CompileTime {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(5, 6));
        System.out.println(c.add(5, 6, 7));
    }
}
