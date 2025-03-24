package com.neoteric.atmprocess.busticketsearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SearchingService {



        TravelDBservice travelDBservice = new TravelDBservice();

        public List<Bus> searchingBus(String fromAndToLocation) {
            List<Bus> matchingBuses = new ArrayList<>();

            for (Bus bus : travelDBservice.buslist) {
                if (bus.fromLocation.equalsIgnoreCase(fromAndToLocation)) {
                    matchingBuses.add(bus);
                }
            }
            return matchingBuses;
        }
    }








