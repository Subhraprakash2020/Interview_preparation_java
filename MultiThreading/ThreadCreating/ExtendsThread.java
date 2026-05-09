package MultiThreading.ThreadCreating;

public class ExtendsThread extends Thread{

    private String threadName;

    ExtendsThread(String name){
        this.threadName = name;
    }
    @Override
    public void run(){
        try{
            System.out.println(threadName + "is running");
            Thread.sleep(500);
            System.out.println(threadName+"has finished sleeping");
        }catch(InterruptedException e){
            System.err.println(threadName+"was interrupted");
        }
    }

    

    public static void main(String[] args) {
        ExtendsThread e1 = new ExtendsThread("Thread 1");
        ExtendsThread e2 = new ExtendsThread("Thread 2");
        e1.start();
        e2.start();
        try{
            System.out.println("Main thread is sleeping");
            Thread.sleep(1000);
            System.out.println("main thread is awake");
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

// class ThreadDemo extends Thread{
//     ThreadDemo(String name){
//         super(name);
//         System.out.println();
//     }
// }

// public class ExtendsThread{
//     public static void main(String[] args) {
        
//     }
// }