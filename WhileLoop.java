public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop num = new WhileLoop();
        num.printSqure(12);
        num.printCube(8);
    }


    //this will print the results up to 100 only
    //beacuse we use the limit in here
    public void printSqure(int num) {
        int i = 1;
        while ((i <= num) && (i * i <= 100)) {
            System.out.println(i * i);
            i++;
        }
        System.out.println("Final value of the i is :"+i);
    }

    //this will print the results up to 150 only
    //beacuse we use the limit in here
    public void printCube(int num) {
        int i = 1;
        while ((i <= num)&&(i*i*i<150)) {
            System.out.println(i * i * i);
            i++;
        }
        System.out.println("Final value of the i is :"+i);
    }
}
