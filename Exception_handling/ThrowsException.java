package Exception_handling;

public class ThrowsException {
    public static void main(String[] args) {
        displayEleme(5);
    }

    public static void displayEleme(int index) throws ArrayIndexOutOfBoundsException{
        int arr[] = {1,2,3,4};
        System.out.println(arr[index]);
    }
}
