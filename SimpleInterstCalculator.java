package org.example;

import java.math.BigDecimal;

public class SimpleInterstCalculator {

    private BigDecimal principle;
    private BigDecimal intrest;

    public SimpleInterstCalculator(BigDecimal principle, BigDecimal intrest) {
        this.principle=principle;
        this.intrest=intrest;

    }

    public BigDecimal getPrinciple() {
        return principle;
    }

    public void setPrinciple(BigDecimal principle) {
        this.principle = principle;
    }

    public BigDecimal getIntrest() {
        return intrest;
    }

    public void setIntrest(BigDecimal intrest) {
        this.intrest = intrest;
    }

    BigDecimal calcualteTotalValue(int years){
        BigDecimal interstAmount =getPrinciple().multiply(getIntrest()).multiply(BigDecimal.valueOf(years)).divide(BigDecimal.valueOf(100));
        return getPrinciple().add(interstAmount);
    }
}
