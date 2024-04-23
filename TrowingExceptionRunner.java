package org.example;

class Amount{
    private String currency;
    private Integer amount;

    public Amount(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws Exception {
        if (this.currency.equals(that.currency)){
            throw new Exception("Currencies not matched");
        }
        this.amount =this.amount + that.amount;
    }

    @Override
    public String toString() {
        return "Amount{" +
                "currency='" + currency + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}

public class TrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount amount1 =new Amount("USD",10);
        Amount amount2 =new Amount("USD",20);
        amount1.add(amount2);
        System.out.println(amount1);

    }
}
