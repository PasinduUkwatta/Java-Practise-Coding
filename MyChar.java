package org.example;

import java.util.Locale;

public class MyChar {
    private char myChar;

    public MyChar(char myChar) {
        this.myChar = myChar;
    }



    public char getMyChar() {
        return myChar;
    }

    public void setMyChar(char myChar) {
        this.myChar = myChar;
    }

    boolean isVowel(){
        return ((getMyChar() == 'a') || (getMyChar() == 'e') || (getMyChar() == 'i') || (getMyChar() == 'o') ||
                (getMyChar() == 'u') || (getMyChar() == 'A') || (getMyChar() =='E') || (getMyChar() == 'I') || (getMyChar() =='U') );
    }

    boolean isNumber(){
        int myNumber =(int)getMyChar();

        return ((30<myNumber)&&(myNumber<40));

    }

    boolean isAlphabet(){
        int myNumber =(int)getMyChar();

        return ((myNumber >= 65 && myNumber <= 90) || (myNumber >= 97 && myNumber <= 122));
    }

    String lowercaseAlphabet(){
       String myChar = String.valueOf(getMyChar());

       return myChar.toLowerCase(Locale.ROOT);
    }

    String uppercaseAlphabet(){
        String myChar = String.valueOf(getMyChar());

        return myChar.toUpperCase(Locale.ROOT);
    }
}
