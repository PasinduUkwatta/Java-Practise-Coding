import java.math.BigDecimal;

public class InterstCalculator {
    public static void main(String[] args) {
        SimpleIntrestCalculator cal = new SimpleIntrestCalculator("4500.00", "0.075");
        BigDecimal totalValue = cal.calculateTotalValue(5);
        System.out.println(totalValue);

    }

}

class SimpleIntrestCalculator {
    BigDecimal principle, interst;

    public SimpleIntrestCalculator(String principle, String interst) {
        this.principle = new BigDecimal(principle);
        this.interst = new BigDecimal(interst);

    }

    public BigDecimal calculateTotalValue(int noOfYears) {

        BigDecimal totalValue = principle.add(principle.multiply(interst)
                .multiply(BigDecimal
                        .valueOf(noOfYears)));
        return totalValue;

    }


}

