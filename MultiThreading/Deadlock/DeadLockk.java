package MultiThreading.Deadlock;

public class DeadLockk {
    static final Object lock1 = new Object();
    static final Object lock2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() ->{
            synchronized(lock1){
                System.out.println("Threa1 holding lock 1");
                try{
                    Thread.sleep(100);
                }catch(Exception e){

                }
                System.out.println("Thread1 waiting for lock2");
                synchronized(lock2){
                    System.out.println("Thread1 holding lock1 and lock2");
                }
            }
        });

        Thread t2 = new Thread(() ->{
            synchronized(lock2){
                System.out.println("Thread2 holding lock 2");
                try{
                    Thread.sleep(100);
                }catch(Exception e){}
                System.out.println("Thread 2 waiting for lock 2");
                synchronized(lock1){
                    System.out.println("Thread2 holding lock 2 and lock 1");
                }
            }
        });

        t1.start();;
        t2.start();
    }
}
