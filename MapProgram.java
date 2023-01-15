import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String,String> languages =new HashMap<>();
        languages.put("Java","A compiled ,object orientated,high level,platform independent");
        languages.put("Python","An interpreted object oriented hig level dynamic enticements");
        languages.put("Algol","An logarithmic language");
        languages.put("Lisp","Therein lies in madness");

        System.out.println(languages.get("Java"));
        languages.put("Java","this course about java");
        System.out.println(languages.get("Java"));

        languages.remove("Algol");
        System.out.println(languages.get("Algol"));
    }
}
