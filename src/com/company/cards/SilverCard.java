package com.company.cards;

import java.math.BigDecimal;

public class SilverCard extends BaseCard {
    public SilverCard(BigDecimal turnover) {
        super(turnover);
    }

    @Override
    double calculateDiscountRate() {
        double discountRate = 2;
        if (getTurnover().compareTo(BigDecimal.valueOf(300)) >= 0) {
            discountRate = 3.5;
        }
        return discountRate;
    }
}
