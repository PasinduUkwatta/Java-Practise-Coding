public class Conversion2 {
    public static void main(String [] args){
        //in this we cannot convert directly, so we need to provide the data type additionally
        double d = 200;
        int i = (int) d;
        System.out.println(i);


        int  b = 200;
        String s1 = "hello";
        String s2 =  b+s1;


        System.out.println(s2);

        //in this conversion we lost 0.5 from the double to integer
        double db = 45.5;
        int r = (int)db;

        System.out.println(r);
    }
}
