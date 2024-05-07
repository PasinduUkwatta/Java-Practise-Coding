package concurrency;

public class Counter {
    int i;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void increment() {
        i++;
    }
}
