import java.util.EnumMap;

public class Enum {
    enum Month{
        Jan,Feb,Mar
    }

    public static void main(String[] args) {
        EnumMap enumCalander  = new EnumMap(Month.class);
        enumCalander.put(Month.Jan,100);
        enumCalander.put(Month.Feb,200);
        enumCalander.put(Month.Mar,300);

        System.out.println(enumCalander);

    }


}
