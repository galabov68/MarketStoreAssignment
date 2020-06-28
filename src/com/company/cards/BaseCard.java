package com.company.cards;

import java.math.BigDecimal;

public abstract class BaseCard {
    private BigDecimal turnover;
    private double discountRate;

    protected BaseCard(BigDecimal turnover) {
        this.turnover = turnover;
        setDiscountRate();
    }

    abstract double calculateDiscountRate();

    public BigDecimal getTurnover() {
        return turnover;
    }

    private void setTurnover(BigDecimal turnover) {
        this.turnover = turnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    private void setDiscountRate() {
        this.discountRate = calculateDiscountRate();
    }
}
