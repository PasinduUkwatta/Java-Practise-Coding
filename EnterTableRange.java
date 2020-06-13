package Pack3;

public class EnterTableRange {
    public static void main(String[] args) {
        TableRange t = new TableRange();
        t.printTableRange(6, 2, 8);

    }
}

class TableRange {
    void printTableRange(int a, int b, int c) {
        for (int i = b; b <= c; b++) {
            System.out.printf("%d * %d  = %d", a, b, a * b).println();
        }

    }
}
