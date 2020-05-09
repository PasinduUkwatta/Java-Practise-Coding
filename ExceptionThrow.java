public class ExceptionThrow {
    public static void main(String[] args) {
        int x =5;
        try{
            //in this we are defineiing new exeception
            //so the exception is handles by this code

            int y =x/3;
            throw new Exception("devide by zero exception");
        }catch (Exception e) {
           System.out.println(e.getMessage());
        }
        finally {
            int y = x/2;
            System.out.println("final block execueted, answer is :"+y);
        }
    }
}
