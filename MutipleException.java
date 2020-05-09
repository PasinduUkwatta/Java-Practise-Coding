public class MutipleException {
    public static void main(String[] args) {
        int x =20;
        try {
            System.out.println("answer is :"+(x/0));
        }catch(NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println("Null pointer exception");
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
            System.out.println("arithmetic exception");
        }
        catch (RuntimeException e){
            System.out.println(e.getMessage());
            System.out.println("runtime exception");
        }
        //we can  use the Exception to catch when we cannot catch the exception from other exceptions
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Generic Exception");
        }
        finally {
            System.out.println("mutiple exception handing");
            System.out.println("finally block executed");
        }
    }
}
