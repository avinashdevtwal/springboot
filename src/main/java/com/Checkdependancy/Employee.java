package com.Checkdependancy;

public class Employee {
  
	private String name; 
    private Address address;
 
 
 public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}


 public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public void getdetails() {
System.out.println("name="+name); 
 System.out.println("address="+address.getAddressline());
 }}