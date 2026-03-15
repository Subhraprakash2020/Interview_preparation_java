package Exception_handling;

public class ThrowException {
    public static void main(String[] args) {
        checkArray(5);
    }

    public static void checkArray(int index){
        int arr[] = {1,2,3,4};
        if(index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("Index out or range");
        }

        System.out.println(arr[index]);
    }
}
