package com.neoteric.atmprocess.constructor;



import java.time.LocalDate;

public class DBTEST {



        public static void main(String[] args) {
            // Create Bus Objects
            BUS bus1 = new BUS(LocalDate.now(), LocalDate.now().plusDays(1),
                    "B123", "Hyderabad", "Bangalore", 40);

            BUS bus2 = new BUS(LocalDate.now(), LocalDate.now().plusDays(2),
                    "B456", "Chennai", "Mumbai", 30);

            // Print Bus Details Before Booking
            System.out.println("Before Booking:");
            System.out.println(bus1);
            System.out.println(bus2);

            // Booking Seats
            bus1.bookSeats(10); // Book 10 seats
            bus2.bookSeats(35); // Attempt to book more than available seats

            // Print Bus Details After Booking
            System.out.println("\nAfter Booking:");
            System.out.println(bus1);
            System.out.println(bus2);
        }
    }


