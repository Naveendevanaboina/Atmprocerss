package com.neoteric.atmprocess.empoyee_address;

public class Address {

String street;
String city;
String state;


 public Address(String street, String city, String state ){
     this.street= street;
     this.city = city;
     this.state= state;

 }
public void OfficeAddress(String street, String city, String state){
    this.street= street;
    this.city = city;
    this.state= state;


    System.out.println("Address: "+ street +","+city+","+state);
    System.out.println("officeAddress: "+ street +","+city+","+state);
}
}
