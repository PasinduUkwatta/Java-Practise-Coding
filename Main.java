import java.util.ArrayList;
import java.util.List;

import static jdk.internal.org.objectweb.asm.util.Printer.printList;

public class Main {
    public static void main(String[] args) {

        Theater theater = new Theater("Olympian", 8, 12);
//        theater.getSeats();
//        if(theater.reserveSeat("H11")){
//            System.out.println("Please pay");
//        }else {
//            System.out.println("Sorry seat is taken !");
//        }

        List<Theater.Seat> seatCopy = new ArrayList<>(theater.seats);
        public static void printList printList(seatCopy);
        seatCopy.get(1).reserve();
        if (theater.reserveSeat("A02")) {
            System.out.println("Please pay for QA2");
        } else {
            System.out.println("Seat already booked");
        }

        (List < Theater.Seat > list) {
            for (Theater.Seat seat : list) {
                System.out.println(" " + seat.getSeatNumber());
            }

            System.out.println();
        }
    }
}