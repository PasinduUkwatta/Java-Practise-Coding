package concurrency;

public class BiCounter {
    private int i;
    private int j;

    synchronized public void incrementI() {
        i++;
    }
    synchronized public void incrementJ() {
        j++;
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
