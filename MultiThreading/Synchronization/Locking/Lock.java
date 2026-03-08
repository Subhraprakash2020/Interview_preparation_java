package MultiThreading.Synchronization.Locking;

import java.util.concurrent.locks.ReentrantLock;

public class Lock {
    int count = 0;
    ReentrantLock lock = new ReentrantLock();
    void increment(){
        lock.lock();
        try{
            count++;
        }
        finally{
            lock.unlock();
        }
    }
}
