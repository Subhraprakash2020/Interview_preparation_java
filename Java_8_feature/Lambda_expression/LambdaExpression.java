package Java_8_feature.Lambda_expression;


// Normat way
// interface My_interface{
//     void show();
// }

// public class LambdaExpression {
//     public static void main(String[] args) {
//         My_interface obj = new My_interface(){
//         public void show(){
//             System.out.println("Interface is printing");
//         }
//     };
//     obj.show();   
//     }

// }


// Using lambda
interface MyInterface{
    void show();
}

public class LambdaExpression{
    public static void main(String[] args) {
        MyInterface obj = () -> System.out.println("THis is lambda expression");
        obj.show();
    }
}