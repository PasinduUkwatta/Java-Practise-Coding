package Pack3;

public class MultiplicationTable {
    public static void main(String[] args) {

        Runner r = new Runner();
        r.run();


        for (int i = 0; i <= 13; i++) {
            System.out.println(" ");
            System.out.println("5 *" + i + " = " + (5 * i));

            System.out.println("");
            System.out.printf("%d * %d  = %d", 5, i, 5 * i);
        }
    }

}

class Runner {
    void run() {
        System.out.println("Mutlpication is running");
    }
}
