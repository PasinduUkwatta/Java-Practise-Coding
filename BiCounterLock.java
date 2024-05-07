package concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterLock {
    private int i;
    private int j;
    Lock lockForI = new ReentrantLock();
    Lock lockForJ = new ReentrantLock();

     public void incrementI() {
lockForI.lock();
        i++;
        lockForI.unlock();
    }
     public void incrementJ() {
        lockForJ.lock();
        j++;
        lockForJ.unlock();
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }
}
