package com.sample;

public class Emp {
 private int id; 
 private String name;
public Emp(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
@Override
public String toString() {
	return "Emp [id=" + id + ", name=" + name + "]";
}
 
}
