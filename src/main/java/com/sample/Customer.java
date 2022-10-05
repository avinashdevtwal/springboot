package com.sample;

public class Customer {
private int id; 
private String name; 
private String city;
public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setCity(String city) {
	this.city = city;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", city=" + city + "]";
}
 
}
