package Pack3;

public class EnterTable {
    public static void main(String[] args) {
        Table t = new Table();
        t.printTable(8);
    }

}


class Table {
    void printTable(int a) {
        for (int i = 0; i <= 13; i++) {
            System.out.println(a + " * " + i + " =" + (a * i));
            System.out.printf("%d  * %d  = %d", a, i, a * i).println();
        }
    }
}
