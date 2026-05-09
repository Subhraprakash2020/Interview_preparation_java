package MultiThreading.ThreadCreating;

public class ImplementRunnable implements Runnable{
    private String threadName;
    ImplementRunnable(String name){
        this.threadName = name;
        System.out.println("Thread" + threadName + "");
    }

    public void run(){
        System.out.println("Thread"+threadName+"Running");
        for(int i = 4;i>0;i--){
            System.out.println("Thread"+threadName+" "+i);
        }
        System.out.println("Thread"+threadName+"State : Dead");
    }


    public static void main(String[] args) {
        ImplementRunnable t1 = new ImplementRunnable("Thread 1");
        ImplementRunnable t2 = new ImplementRunnable("Thread 2");

        Thread thread1 = new Thread(t1);
        Thread thread2 = new Thread(t2);
        thread1.start();
        thread2.start();
        
    }
}
