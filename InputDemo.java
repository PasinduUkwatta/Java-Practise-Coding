import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class InputDemo {
    public static void main(String[] args) {
        //in this we are creating a new file
        //if the file not exixst
        //this will automatically crate a file and do the writting process
        File file= new File("C:\\Users\\Pasindu Thiwanka\\Desktop\\A.txt");
        InputDemo demo = new InputDemo();
        demo.writeToFile(file);

    }

    public void writeToFile(File file){
        //from the try catch we are handling the fil not found exception

        try{
           PrintWriter wr = new PrintWriter(file);
           wr.println("pasindu");
           wr.println("welcome to java programming");
           wr.close();

       }
       catch (FileNotFoundException e){
           System.out.println(e.getMessage());
           throw new RuntimeException(e);
       }
       finally {
            System.out.println("end of the execution");
       }

    }

}
