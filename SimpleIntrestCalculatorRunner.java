package org.example;

import java.math.BigDecimal;

public class SimpleIntrestCalculatorRunner {
    public static void main(String[] args) {
        SimpleInterstCalculator simpleInterstCalculator =new SimpleInterstCalculator(new BigDecimal("4500.00"),new BigDecimal("1"));

       BigDecimal totalValue = simpleInterstCalculator.calcualteTotalValue(5);
        System.out.println(totalValue);

    }
}
