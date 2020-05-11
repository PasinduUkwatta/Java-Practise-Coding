import java.io.File;

public class ObjectInputStream {
    public static void main(String[] args) {
        new ObjectInputStream().deserialize(seriazibaleFile);
    }

    private void deserialize(File file){

        FileInputStream fileStream = new FileInputStream(file);
        ObjectInputStream objectStream = new ObjectInputStream(fileStream);
        objectStream.readObject();
        VehicleInfo deserializedObject = (VehicleInfo)objectStream.readObject();
        System.out.println("deserilization :"+deserializedObject.nameOfVehicle);
        System.out.println("deserilization :"+deserializedObject.numberOfWheels);
        System.out.println("deserilization :"+deserializedObject.milage);

    }
}
