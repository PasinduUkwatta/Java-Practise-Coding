package concurrency;

import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.LongAdder;

public class ConcurrentMapRunner {
    public static void main(String[] args) {
        ConcurrentMap<Character, LongAdder> occurences =new ConcurrentHashMap<>();
        String str ="ABCD ABCD ABCD";

        for(char charactor : str.toCharArray()){
            occurences.computeIfAbsent(charactor,character -> new LongAdder()).increment();
//            LongAdder longAdder = occurences.get(charactor);
//            if(longAdder==null){
//                longAdder = new LongAdder();
//            }
//            longAdder.increment();
//            occurences.put(charactor, longAdder);
        }
        System.out.println(occurences);
    }
}
