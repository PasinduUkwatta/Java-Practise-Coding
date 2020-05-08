public class Computer {
    public static void main(String[] args) {
        Memory m = new Memory();
        m.setSize(1024);
        System.out.println(m.getSize());
    }
}

class Memory{
    private long size;

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
