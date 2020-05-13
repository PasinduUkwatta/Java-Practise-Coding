import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {

        MapDemo demo = new MapDemo();
        demo.printMap(demo.craeteHashMap());

    }

    private Map craeteHashMap(){
        Map emlyeeMap = new HashMap();

        //in this there are duplicate keys ,so the first value is replaced by the second value
        //so the output will be second value
        emlyeeMap.put(1,"x");
        emlyeeMap.put(2,"y");
        emlyeeMap.put(2,"z");
        emlyeeMap.put(5,"a");
        emlyeeMap.put(5,"b");
        emlyeeMap.put(4,"x");
        emlyeeMap.put(4,"y");
        emlyeeMap.put(6,"z");
        emlyeeMap.put(5,"a");
        emlyeeMap.put(6,"b");
        emlyeeMap.put(8,"x");
        emlyeeMap.put(2,"y");
        emlyeeMap.put(9,"z");
        emlyeeMap.put(7,"a");
        emlyeeMap.put(5,"b");

        return emlyeeMap;
    }

    private void printMap(Map mapPrint){
        Set keys = mapPrint.keySet();
        System.out.println(mapPrint);
    }

}
