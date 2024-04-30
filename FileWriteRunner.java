package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileWriteRunner {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("D:\\Self Study\\Projects\\Java\\src\\main\\java\\resources\\data.txt");

        List<String> list=
                List.of("Apple","Boy","Cat","Dog","Elephant");

        Files.write(path,list);


    }
}
