package constructor;

class P{
    P(int i){
        System.out.println(i);
    }
}

class C extends P{
    C(){
        super(10);
    }
}

public class THiss {
    public static void main(String[] args) {
       
        System.out.println("Hello");
    }
}
