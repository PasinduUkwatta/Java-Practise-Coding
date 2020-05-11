import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.FilterOutputStream;


public class ScanFile {
    public static void main(String[] args) throws FileNotFoundException{
        File info = new File("C:\\Users\\Pasindu Thiwanka\\Desktop\\Info.txt");
        ScanFile sc =new ScanFile();
        sc.readFile(info);
        int x =10;

    }

    public void readFile(File fileRead) throws FileNotFoundException {
        Scanner input = new Scanner(fileRead);
        System.out.println("Line read from the file"+input.nextLine());

    }

}


