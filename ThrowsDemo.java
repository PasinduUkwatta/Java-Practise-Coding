public class ThrowsDemo  {
    public static void main(String[] args) throws Exception{
      int x=10;

        try {
           int ans =(x/0);
           System.out.println(ans);
       }
       catch (NullPointerException e){
           System.out.println(e.getMessage());
       }


    }
}
