import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList2 {
    public static void main(String[] args) {
      List li = new ArrayList().dataInsertedArrayList();
      new ArrayList().printList(li);
    }

    private list dataInsertArrayList(){
        List<String> fruits = new ArrayList<>();
        fruits.add("mango");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("pinaaaple");
        fruits.add("grapes");

        return fruits;
    }

    private void printList(List list){
        Iterator itr = list.iterator();
        while (itr.hasNext()){

            System.out.println("friuts in the array is "+itr.next());



        }
    }
}
