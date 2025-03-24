package com.neoteric.atmprocess.constructor;

public class Seats {

    public int numSeats;
        public BUS bus;

        // Constructor to Initialize Values
        public Seats(int numSeats, BUS bus) {
            this.numSeats = numSeats;
            this.bus = bus;
        }

        @Override
        public String toString() {
            return "Seats [Number of Seats=" + numSeats + ", Bus=" + bus + "]";
        }
    }




