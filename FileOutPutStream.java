import java.io.File;
import java.io.IOException;

public class FileOutPutStream {
    public FileOutPutStream(File file) {
    }

    public FileOutPutStream() {

    }

    public static void main(String[] args) throws IOException {
        FileOutPutStream fo = new FileOutPutStream();
        fo.writeToFile(new File("C:\\Users\\Pasindu Thiwanka\\Desktop\\Message.txt"));

    }

    private void writeToFile(byte[] file) throws IOException {
        FileOutPutStream fo = new FileOutPutStream(file);
        fo.writeToFile("hello weclome to the java programming".getBytes());



    }
}
