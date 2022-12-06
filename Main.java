public class Main {
    public static void main(String[] args) {
        Account timesAccount =new Account("Tim");
        timesAccount.deposit(1000);
        timesAccount.withdraw(500);
        timesAccount.withdraw(-200);
        timesAccount.deposit(-40);
        timesAccount.calculateBalance();

        System.out.println("Balnce on account is "+timesAccount.getBalance());

    }
}