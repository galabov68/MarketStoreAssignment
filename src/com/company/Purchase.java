package com.company;

import com.company.cards.BaseCard;

import java.math.BigDecimal;

public class Purchase {

    protected Purchase() {
    }

    public static String makePurchase(BigDecimal valueOfPurchase, BaseCard baseCard) {
        return getPurchaseInfo(valueOfPurchase, baseCard);
    }

    private static String getPurchaseInfo(BigDecimal valueOfPurchase, BaseCard baseCard) {
        BigDecimal discount = calculateDiscount(valueOfPurchase, baseCard);
        return String.format("Purchase value: $%.2f%n", valueOfPurchase) +
                String.format("Discount rate: %.1f%%%n", baseCard.getDiscountRate()) +
                String.format("Discount: $%.2f%n", discount) +
                String.format("Total: $%.2f%n", valueOfPurchase.subtract(discount));
    }

    private static BigDecimal calculateDiscount(BigDecimal valueOfPurchase, BaseCard baseCard) {
        return valueOfPurchase.multiply(BigDecimal.valueOf(baseCard.getDiscountRate() / 100));
    }
}