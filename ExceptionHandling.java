public class ExceptionHandling {
    public static void main(String[] args) {
        int x = 10;

        //in this we get a an exception
        //so we need to provide solution for the exception
        //so we put risky code i nthe try block
        //catch block put to exec ue when occures a problem
        try {
            System.out.println("answer is :" + (x / 0));
        } catch (Exception e){
            System.out.println("answer is :" + (x / 1));
            System.out.println("Catch block executed");

        }
        finally {
            //FINALLY CODE EXECUTED ANYTIME
            System.out.println("CODE EXECUTE IS FINISHED");
        }

        int y = 70;


        try {
            System.out.println("answer is :" + (y / 2));
            System.out.println("try block executed" );

        } catch (Exception e){
            System.out.println("answer is :" + (x / 1));
            System.out.println("Catch block executed");

        }
        finally {
            //FINALLY CODE EXECUTED ANYTIME
            System.out.println("CODE EXECUTE IS FINISHED");
        }

    }
}
