package MultiThreading.ThreadCreating;

class Counter{
    int count = 0;
    public void increment(){
        count++;
    }
}

public class RaceCondition {

    public static void main(String[] args) throws InterruptedException {
        Counter rc = new Counter();
        Thread t1 = new Thread(()->{
            for(int i = 0;i<1000;i++){
                rc.increment();
            }
        });

        Thread t2 = new Thread(()->{
            for(int i = 0;i<1000;i++){
                rc.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println("Final count: " + rc.count);
    }

}
