package DesignePattern;

public class SingleTone {
    private static SingleTone instance;

    private SingleTone(){
        System.out.println("Single tone object is created");
    }

    public static SingleTone getInstance(){
        if(instance == null){
            instance = new SingleTone();
        }
        return instance;
    }

    public static void main(String[] args) {
        SingleTone obj1 = SingleTone.getInstance();
        SingleTone obj2 = SingleTone.getInstance();
        System.out.println(obj1 == obj2);
    }
}
