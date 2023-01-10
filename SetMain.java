import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class SetMain {
    public static void main(String[] args) {
        Set<Integer> squares = new HashSet<>();
        Set<Integer> cubes = new HashSet<>();


        for (int i = 1; i <= 100; i++) {
            squares.add(i * i);
            cubes.add(i * i * i);
        }

        System.out.println("there are " + squares.size() + " squares and " + cubes.size() + " cubes .");

        Set<Integer> union = new HashSet<>(squares);
        union.addAll(cubes);
        System.out.println("Union conatains " + union.size() + " elements.");
        System.out.println(union);


        Set<Integer> interSection = new HashSet<>(squares);
        interSection.retainAll(cubes);
        System.out.println("Intersection contains" + interSection.size() + " elements .");

        for (int i : interSection) {
            System.out.println(i + " is the squre of " + Math.sqrt(i) + " and the cube of " + Math.cbrt(i));
        }

        Set<String> words = new HashSet<>();
        String sentence = "one day in the year";
        String[] arrayWords = sentence.split(" ");
        words.addAll(Arrays.asList(arrayWords));

        for (String s : words) {
            System.out.println(s);
        }

        Set<String> nature = new HashSet<>();
        Set<String> divine = new HashSet<>();
        String[] natureWords = {"all", "nature", "is", "but", "art", "unknown", "to", "thee"};
        nature.addAll(Arrays.asList(natureWords));
        String[] divineWords = {"to", "err", "is", "human", "to", "forgive", "divine"};
        divine.addAll(Arrays.asList(divineWords));

        System.out.println("Nature - divine");
        Set<String> diff1 = new HashSet<>(nature);
        diff1.removeAll(divine);
        printSet(diff1);

        System.out.println("Divine - nature");
        Set<String> diff2 = new HashSet<>(divine);
        diff2.removeAll(nature);
        printSet(diff2);
    }

        private static void printSet(Set<String> set){
            System.out.println("\t");
            for(String s:set){
                System.out.println(s+ " ");
            }
            System.out.println();
        }
    }

