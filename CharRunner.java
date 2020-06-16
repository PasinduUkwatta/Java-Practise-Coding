public class CharRunner {
    public static void main(String[] args) {
        MyChar ch = new MyChar('c');
        System.out.println(ch.isVowel());
    }
    

}

class MyChar{

    private final char ch;

    public MyChar(char ch) {
        this.ch =ch;
    }


    public boolean isVowel() {
        return false;
    }
}
