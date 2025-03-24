package com.neoteric.atmprocess.empoyee_address;

public class AddressTest {

    public static void main(String[] args) {
        Address addr = new Address("Vinay Nagar","HYD","TG");
        Address officeAddress = new Address("Vijay Nagar","HYD", "TG");
        Employee employee = new Employee("Ganesh",56574, 20000.0,addr);
   employee.displayEmployeeInfo();


    }
}
