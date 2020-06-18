public class CharRunner {
    
    public static void main(String[] args) {
        MyChar ch = new MyChar('A');
        System.out.println(ch.isVowel());
        System.out.println(ch.isConsonant());
        System.out.println(ch.isDigit());
        System.out.println(ch.isAlphabet());
        MyChar.printLowerCaseAlphabet();
        MyChar.printUpperCaseAlphabet();
        

    }
    

}

class MyChar {

    private char ch;

    public MyChar(char ch) {
        this.ch = ch;
    }

    public static void printLowerCaseAlphabet() {
        for(char i='a';i<='z';i++){
            System.out.println(i);
        }
    }

    public static void printUpperCaseAlphabet() {
        for(char i='A';i<='Z';i++){
            System.out.println(i);
        }
    }


    public boolean isVowel() {

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        } else {
            return false;
        }

    }

    public boolean isDigit() {
        if(48<= ch && ch>= 57){
            return true;
        }else{
            return false;
        }

    }

    public boolean isAlphabet() {
        if(ch>=65 && ch<=122){
            return true;
        }else {
            return false;
        }
    }

    public boolean isConsonant() {
        if(isAlphabet() && !isVowel()){
            return true;
        }else {
            return false;
        }
    }
}

