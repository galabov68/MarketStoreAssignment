package com.company;

import com.company.cards.BronzeCard;
import com.company.cards.GoldCard;
import com.company.cards.SilverCard;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        BronzeCard bronzeCard = new BronzeCard(BigDecimal.valueOf(0));
        SilverCard silverCard = new SilverCard(BigDecimal.valueOf(600));
        GoldCard goldCard = new GoldCard(BigDecimal.valueOf(1500));
        System.out.println(Purchase.makePurchase(BigDecimal.valueOf(150), bronzeCard));
        System.out.println(Purchase.makePurchase(BigDecimal.valueOf(850), silverCard));
        System.out.println(Purchase.makePurchase(BigDecimal.valueOf(1300), goldCard));
    }
}
