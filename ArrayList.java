import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
      List reurnedArrayList = new ArrayList().createArrayList();
      new ArrayList().printArrayList(reurnedArrayList);
        

    }


    private List createArrayList(){
        List<String> cars = new java.util.ArrayList<>();
        cars.add("bmw") ;
        cars.add("toyota")  ;
        cars.add("nissna") ;
        cars.add("lambogini")  ;
        return cars;

    }

    private void printArrayList (List list){
       Iterator listIterator = list.iterator() ;
       while(listIterator.hasNext()){
           System.out.println("value in the list :"+listIterator.next());
       }

    }
}
