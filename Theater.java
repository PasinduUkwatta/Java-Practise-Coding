import java.util.*;

public class Theater {
    private final String theaterName;
    public List<Seat> seats =new ArrayList<>();

    public Theater(String theaterName,int numRows,int seatsPerRow) {
        this.theaterName = theaterName;

        int lastRow ='A' +(numRows-1);
        for(char row ='A';row <=lastRow;row++){
            for(int seatNum=1;seatNum<=seatsPerRow;seatNum++){
                Seat seat = new Seat(row + String.format("402d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheaterName() {
        return theaterName;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat =Collections.binarySearch(seats,requestedSeat,null);
        if(foundSeat>=0){
            return seats.get(foundSeat).reserve();
        }else {
            System.out.println("There is no seat  "+seatNumber);
            return false;
        }
//        for(Seat seat :seats){
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat=seat;
//                break;
//            }
//        }
//
//        if(requestedSeat==null){
//            System.out.println("There is no seat "+seatNumber);
//            return false;
//        }
//        return requestedSeat.reserve();
    }

    public void getSeats(){
        for(Seat seat:seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public static class Seat implements Comparable<Seat>{
        public final String seatNumber;
        public boolean reserved =false;

        public Seat(String seatNumber) {
            this.seatNumber = seatNumber;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
           if(!this.reserved){
               this.reserved=true;
               System.out.println("Seat "+seatNumber+" reserved");
               return true;
           }else {
               return false;
           }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved=false;
                System.out.println("Reservation of seat "+seatNumber +" cancelled");
                return true;
            }else {
                return false;
            }
        }

        public String getSeatNumber() {
            return seatNumber;
        }
    }
}
