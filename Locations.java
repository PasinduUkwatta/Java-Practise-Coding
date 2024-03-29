import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer,Location>{
    private static Map<Integer,Location> locations =new HashMap<Integer,Location>();

    public static void main(String[] args)  {
        FileWriter locFile =null;
        try{
            locFile =new FileWriter("locations.txt");
            for (Location location : locations.values()) {
                locFile.write(location.getLocationID() + " ," + location.getDiscription());
            }
        }catch (IOException e){
            System.out.println("In catch block");
            e.printStackTrace();
        }
        finally {
            System.out.println("Finally block executed");
            try {
                if(locFile !=null){
                    locFile.close();
                }

            }catch (IOException e){
e.printStackTrace();
            }
        }
    }

    @Override
    public int size() {
        return locations.size();
    }

    @Override
    public boolean isEmpty() {
        return locations.isEmpty();
    }

    @Override
    public boolean containsKey(Object key) {
        return locations.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return locations.containsValue(value);
    }

    @Override
    public Location get(Object key) {
        return locations.get(key);
    }

    @Override
    public Location put(Integer key, Location value) {
        return locations.put(key,value);
    }

    @Override
    public Location remove(Object key) {
        return locations.remove(key);
    }

    @Override
    public void putAll(Map<? extends Integer, ? extends Location> m) {

    }

    @Override
    public void clear() {
locations.clear();
    }

    @Override
    public Set<Integer> keySet() {
        return locations.keySet();
    }

    @Override
    public Collection<Location> values() {
        return locations.values();
    }

    @Override
    public Set<Entry<Integer, Location>> entrySet() {
        return locations.entrySet();
    }
}
