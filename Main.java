public class Main {
    public static void main(String[] args) {
            String privateVar ="this is private main ()";

            ScopeCheck scopeInstance =new ScopeCheck();
        System.out.println("Scope instance privatevar is  :"+scopeInstance.getPrivateVar());
        System.out.println(privateVar);

        scopeInstance.timesTwo();

    }
}