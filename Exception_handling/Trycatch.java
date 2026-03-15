package Exception_handling;

public class Trycatch {
        public static void main(String[] args) {
            try{
                int a[] = new int[2];
                System.out.println("access element here"+a[3]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Exception thrown"+e);
            }
        }
}
