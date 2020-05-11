import java.io.Serializable;

//seriaziable is a marlker interface
//it gives special functions
public class VehicleInfo implements Serializable {
    int numberOfWheels;
    int milage;
    String nameOfVehicle;

   public void vehicleInfo(String nameOfVehicle,int numberOfWheels,int milage){
        this.nameOfVehicle = nameOfVehicle;
        this.numberOfWheels = numberOfWheels;
        this.milage = milage;


    }
}
