public class VehicleInheritance {
    String colour = "black";
    int noOfWheels = 4;

    public void drive(){
        System.out.println("parent method drive method is called");
    }
}


class Car extends VehicleInheritance{
    String brand ="toyota";
    int price =350000;

    public void printDetails(){
        System.out.println("brand of the car is :"+brand);
        System.out.println("price of the car is :"+price);
        System.out.println("colour of the car is :"+colour);
        System.out.println("no of wheels of the car is :"+noOfWheels);
        System.out.println(" ");
    }



    @Override
    public void drive() {

        System.out.println("car is driving,parent method is overrided");


    }

    public static void main(String[] args) {
        Car c = new Car();
        c.printDetails();

        //in this car drive method is over ride by the child class drive method
        //so the child class drive method is executed first
        c.drive();
    }
}
class Van extends VehicleInheritance{
        String brand ="mazda";
        int price =480000;

    public void printDetails(){
        System.out.println("brand of the van is :"+brand);
        System.out.println("price of the van is :"+price);
        System.out.println("colour of the van is :"+colour);
        System.out.println("no of wheels of the van is :"+noOfWheels);
        System.out.println(" ");}



        public static void main(String[] args) {
            Van v = new Van();
            v.printDetails();

            //in this the van doesnt have a drive method
            //so the parent class drive method is executed
            v.drive();
        }
}

