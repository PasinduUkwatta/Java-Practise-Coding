import java.io.File;
import java.io.IOException;

public class FileWritter {
    public static void main(String[] args) throws IOException {
        FileWritter fr = new FileWritter();
        File bikeFile = new File("C:\\Users\\Pasindu Thiwanka\\Desktop\\Info.txt");
        fr.writeToFile(bikeFile);

    }

    private void writeToFile(File FiletoWrite) throws IOException{
        FileWritter bikeInfoWritter = new FileWritter(FiletoWrite);
        bikeInfoWritter.writeToFile(new File("yamaha"));
        bikeInfoWritter.writeToFile(new File("honda"));
        bikeInfoWritter.writeToFile(new File("zubsuki"));
        bikeInfoWritter.writeToFile(new File("bajaj"));


    }
}
