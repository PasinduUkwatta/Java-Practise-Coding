import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {

        Set set = new Set();
        Set hashSet = set.createHashSet();
        Set linkedSet = set.createlinkedHashSet();
        set.printSet(hashSet);
        set.printSet(linkedSet);

    }

    private set createHashSet(){
        HashSet hs = new HashSet();
        hs.add(2);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        return hs;

    }

    private set createlinkedHashSet(){
        LinkedHashSet ls = new LinkedHashSet();
        ls.add(4);
        ls.add(4);
        ls.add(5);
        ls.add(5);
        ls.add(6);
        ls.add(6);

        return ls;
    }

    private set printSet(Set set){
        Iterator setIterator = set.iterator();
        while(setIterator.hasNext()){
            System.out.println("value is :"+setIterator.next());
        }
    }


}
