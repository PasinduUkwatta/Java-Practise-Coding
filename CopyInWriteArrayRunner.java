package concurrency;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyInWriteArrayRunner {
    public static void main(String[] args) {
        List<String> list = new CopyOnWriteArrayList<>();

        list.add("Ant");
        list.add("Bat");
        list.add("Cat");
        for (String s : list) {
            System.out.println(s);
        }

    }
}
