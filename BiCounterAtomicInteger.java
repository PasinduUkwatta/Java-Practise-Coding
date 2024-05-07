package concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class BiCounterAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();

    synchronized public void incrementI() {
        i.incrementAndGet();
    }
    synchronized public void incrementJ() {
        j.incrementAndGet();
    }

    public AtomicInteger getI() {
        return i;
    }

    public AtomicInteger getJ() {
        return j;
    }
}
