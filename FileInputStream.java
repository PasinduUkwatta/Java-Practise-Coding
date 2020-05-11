public class FileInputStream {
    public static void main(String[] args) {
        FileInputStream fileInputStream = new FileInputStream();
        fileInputStream.readFromFile("C:\\Users\\Pasindu Thiwanka\\Desktop\\Message.txt");

    }

    private void readFromFile(String fileToRead) {
        FileInputStream inputStream = new FileInputStream(fileToRead);
        int intergerFromStream  ;
        while ( (intergerFromStream =inputStream.readFromFile())!=-1){
            System.out.println("charcter from the stream "+(char)intergerFromStream);

        }
        inputStream.close();
    }
}
