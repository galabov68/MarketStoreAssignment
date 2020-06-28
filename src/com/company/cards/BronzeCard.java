package com.company.cards;

import java.math.BigDecimal;

public class BronzeCard extends BaseCard {

    public BronzeCard(BigDecimal turnover) {
        super(turnover);
    }

    @Override
    double calculateDiscountRate() {
        double discountRate = 0;
        if (getTurnover().compareTo(BigDecimal.valueOf(300)) >= 0) {
            discountRate = 2.5;
        } else if (getTurnover().compareTo(BigDecimal.valueOf(100)) >= 0) {
            discountRate = 1;
        }
        return discountRate;
    }
}
