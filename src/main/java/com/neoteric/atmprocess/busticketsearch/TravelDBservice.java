package com.neoteric.atmprocess.busticketsearch;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TravelDBservice {
    Map<String, Bus> fromandtoLocationData = new HashMap<>();
    public List<Bus> buslist = new ArrayList<>();
    public TravelDBservice(){
        popluateBusData();
    }
    public  void popluateBusData() {
        Bus bus1 = new Bus();
        bus1.fromDate = "21-3-25";
        bus1.toDate = "22-3-25";
        bus1.serviceNum = "TG23456";
        bus1.fromLocation = "HYD";
        bus1.toLocation="VIJ";
        fromandtoLocationData.put(bus1.fromLocation,bus1);
        fromandtoLocationData.put(bus1.toLocation,bus1);



        Bus bus2 = new Bus();
        bus2.fromDate = "21-3-25";
        bus2.toDate = "22-3-25";
        bus2.serviceNum = "TG7777";
        bus2.fromLocation = "HYD";
        bus2.toLocation="KOD";
        fromandtoLocationData.put(bus2.fromLocation,bus2);
        fromandtoLocationData.put(bus2.toLocation,bus2);

        Bus bus3 = new Bus();
        bus3.fromDate = "21-3-25";
        bus3.toDate = "22-3-25";
        bus3.serviceNum = "TG2222";
        bus3.fromLocation = "HYD";
        bus3.toLocation="KHM";
        fromandtoLocationData.put(bus3.fromLocation,bus3);
        fromandtoLocationData.put(bus3.toLocation,bus3);


        buslist.add(bus1);
        buslist.add(bus2);
        buslist.add(bus3);
    }


        }






