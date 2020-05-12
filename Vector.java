import java.util.*;

public class Vector {
    public static void main(String[] args) {
        Vector<String> vr = new Vector<String>();
        vr.add("Pasindu");
        vr.addElement("Thiwanka");
        vr.addElement("Deshan");

        Iterator itr = vr.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }

    }

}
