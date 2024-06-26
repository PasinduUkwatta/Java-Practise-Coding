package resources;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadRunner {
    public static void main(String[] args) throws IOException {
        Path pathFileToRead = Paths.get("D:\\Self Study\\Projects\\Java\\src\\main\\java\\resources\\data.txt");
        List lines =Files.readAllLines(pathFileToRead);
        System.out.println(lines);

        Files.lines(pathFileToRead)
                .map(String::toLowerCase)
                .filter(str->str.contains("a"))
                .forEach(System.out::println);

    }
}
