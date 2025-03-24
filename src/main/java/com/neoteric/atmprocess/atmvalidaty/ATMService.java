package com.neoteric.atmprocess.atmvalidaty;

import java.util.Map;

public class ATMService {



    public void getbalancecheck(){



    }

    boolean insertCard(Card card) {
        DBService dbService = new DBService();
        Map<String, Card> cardDB = dbService.cardData;
        if (cardDB.containsKey(card.number)) {
            return true;
        } else {
            return false;
        }
    }
    boolean enterPin(Pin vPin) {
        DBService dbService = new DBService();
        Map<String, Pin> pincardDB = dbService.cardPinData;
        Pin dbPin = pincardDB.get(vPin.CardNumber);
        int vpin = Integer.parseInt(vPin.CardNumber);
        int dbpin = Integer.parseInt(dbPin.pinNumber);
        if (vpin == dbpin) {
            return true;
        } else {
            return false;
        }
    }

        boolean withDraw(Amount inputaAmount, Card card){
        DBService dbService = new DBService();
        Map<String, Amount> withDrawDB = dbService.withDrawData;
        Amount availableBalance = withDrawDB.get(card.number);
        if (availableBalance.amount > inputaAmount.amount){

            double totalBalance =  availableBalance.amount -  inputaAmount.amount;
          return  true;
        }else {
            return false;

        }





    }
}
