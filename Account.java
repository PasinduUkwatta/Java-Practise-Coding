import java.util.ArrayList;

public class Account {
    private String accountName;
    private int balance;
    private ArrayList<Integer> transactions;


    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions=new ArrayList<Integer>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount){
        if(amount>0){
            transactions.add(amount);
            this.balance+=amount;
            System.out.println(amount +" deposited, Balance is now "+this.balance);
        }else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdraw(int amount){
        int withdrawl =-amount;
        if(withdrawl<0){
            this.transactions.add(withdrawl);
            this.balance+=withdrawl;
            System.out.println(amount + " withdrawn, balance is now " +this.balance);
        }else {
            System.out.println("Cannot withdrawn negative sums");
        }
    }

    public void calculateBalance(){
        this.balance=0;
        for(int i :this.transactions){
            this.balance+=i;
        }
        System.out.println("Calculated balnce is" +this.balance);
    }
}
