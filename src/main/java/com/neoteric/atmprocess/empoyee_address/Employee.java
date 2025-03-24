package com.neoteric.atmprocess.empoyee_address;

public class Employee {
    String name;
      int id;
      double salary;
      Address address;

      public Employee(String name, int id, double salary, Address address){
          this.name=name;
          this.id=id;
          this.salary=salary;
          this.address=address;
      }
public void displayEmployeeInfo(){
    System.out.println("Employee ID: " + id);
    System.out.println("Name: " + name);
    System.out.println("Salary: " + salary);
    address.OfficeAddress("Vijay Nagar","HYD","TG");
}
}
