package com.neoteric.atmprocess.busticketsearch;

import java.util.List;

public class SearchTest {
    public static void main(String[] args) {

        SearchingService searchService = new SearchingService();

        List<Bus> buses = searchService.searchingBus("HYD");
        if (buses.isEmpty()) {
            System.out.println("No buses found for the given route.");
        } else {
            for (Bus bus : buses) {
                System.out.println("Service Number: " + bus.serviceNum +
                        ", From location: " + bus.fromLocation +
                        ", To location: " + bus.toLocation);
            }
    }


}
}






