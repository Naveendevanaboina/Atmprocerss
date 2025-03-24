package com.neoteric.atmprocess.atmvalidaty;

import java.util.HashMap;
import java.util.Map;

public class DBService {

    Map<String, Card> cardData = new HashMap<>();
    Map<String, Pin> cardPinData = new HashMap<>();
    Map<String , Amount> withDrawData = new HashMap<>();

    public DBService(){
        populateData();
        populatePinData();
        populatewithDrawData();

    }
     public void  populateData() {

         populateData();
         Card card11 = new Card();
         card11.name = "Naveen";
         card11.number = "11111";
         card11.fromDate = "14-08-2023";
         card11.toDate = "12-03-2027";
         cardData.put("11111", card11);
     }
         public void  populatePinData(){

        Pin pin11 = new Pin();
        pin11.pinNumber = "1111";
        pin11.CardNumber="11111";
        cardPinData.put("11111", pin11);




        }
        public  void  populatewithDrawData(){
            Amount amount11 = new Amount();
            amount11.amount=10000;
            amount11.currency="INR";
            withDrawData.put("11111",amount11);

        }

    }


