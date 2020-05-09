public class NestedException {
    public static void main(String[] args) {
        int x= 10;
        int [] arr = {1,2,3,4,5};
        try {
            System.out.println("answer is :"+(x/2));
            try {
                System.out.println("element at the index 5 is"+(arr[5]));
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println("nested catch block executed");
                System.out.println("array index out of the bound execption");
            }

            }
        catch(Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Nested exception handling is done ");
        }
    }
}
