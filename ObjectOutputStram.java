import java.io.File;
import java.io.FilterOutputStream;

public class ObjectOutputStram {
    public static void main(String[] args) {

        VehicleInfo vf = new VehicleInfo("bmw",4,10);
        new ObjectOutputStram().serealize(new File("C:\\Users\\Pasindu Thiwanka\\Desktop\\serilize.bin"),bmw);


    }

    private void serealize(File file,VehicleInfo instanceofVehicleInfo){
        FilterOutputStream fout = new FilterOutputStream(file);
        ObjectOutputStram stream = new ObjectOutputStram(fout);
        stream.write(instanceofVehicleInfo);


    }
}
