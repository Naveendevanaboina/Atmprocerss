package com.neoteric.atmprocess.constructor;

import java.time.LocalDate;

public class BUS {

    public LocalDate fromDate;
        public LocalDate toDate;
        public String serviceNum;
        public String fromLocation;
        public String toLocation;
        public int totalSeats;
        public int bookedSeats;

        // Constructor
        public BUS(LocalDate fromDate, LocalDate toDate, String serviceNum,
                   String fromLocation, String toLocation, int totalSeats) {
            this.fromDate = fromDate;
            this.toDate = toDate;
            this.serviceNum = serviceNum;
            this.fromLocation = fromLocation;
            this.toLocation = toLocation;
            this.totalSeats = totalSeats;
            this.bookedSeats = 0; // Initially no seats booked
        }

        // Method to Book Seats
        public boolean bookSeats(int num) {
            if (num <= getAvailableSeats()) {
                bookedSeats += num;
                System.out.println(num + " seats booked successfully on " + serviceNum);
                return true;
            } else {
                System.out.println("Booking failed! Not enough available seats.");
                return false;
            }
        }

        // Method to Get Available Seats
        public int getAvailableSeats() {
            return totalSeats - bookedSeats;
        }

        @Override
        public String toString() {
            return "Bus [Service Number=" + serviceNum + ", From=" + fromLocation +
                    ", To=" + toLocation + ", Date=" + fromDate + " to " + toDate +
                    ", Total Seats=" + totalSeats + ", Booked Seats=" + bookedSeats +
                    ", Available Seats=" + getAvailableSeats() + "]";
        }
    }





