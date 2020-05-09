package Pack1;

import Pack2.CalculaterMethods;

public class CalImpl {
    public static void main(String[] args) {
        CalculaterMethods c1 = new CalculaterMethods();
        CalculaterMethods c2 = new CalculaterMethods();
        CalculaterMethods c3 = new CalculaterMethods();
        CalculaterMethods c4 = new CalculaterMethods();
        CalculaterMethods c5 = new CalculaterMethods();

        //in this we are accesing the method in other package
        //default acces level can acces the same packeage methods
        c1.addTwo(10,20);
        c2.subTwo(30,15);
        c3.mulTwo(4,6);
        c4.divTwo(100,5);
        c5.remTwo(30,4);
    }
}
