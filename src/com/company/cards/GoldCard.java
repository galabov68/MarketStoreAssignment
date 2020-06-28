package com.company.cards;

import java.math.BigDecimal;

public class GoldCard extends BaseCard {
    public GoldCard(BigDecimal turnover) {
        super(turnover);
    }

    @Override
    double calculateDiscountRate() {
        double discountRate = 2;
        while (getTurnover().remainder(BigDecimal.valueOf(100)).compareTo(BigDecimal.valueOf(0)) == 0) {
            if (discountRate == 10) {
                break;
            }
            discountRate++;
        }

        return discountRate;
    }
}
