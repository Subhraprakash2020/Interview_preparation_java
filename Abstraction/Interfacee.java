package Abstraction;

interface Payment{
    void pay();
}

class CreditCard implements Payment{
    public void pay(){
        System.out.println("Paid using credit card");
    }
}

class UPI implements Payment{
    public void pay(){
        System.out.println("Paid using UPI");
    }
}

public class Interfacee {
    public static void main(String[] args) {
        Payment p = new CreditCard();
        Payment p1 = new UPI();
        p.pay();
        p1.pay();
    }
}
