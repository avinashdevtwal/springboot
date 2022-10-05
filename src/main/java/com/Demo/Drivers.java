package com.Demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Required;

public class Drivers {
	private String driver; 
private String url; 
private String username; 
private String password;
 
@Required
public void setDriver(String driver) {
	this.driver = driver;
}
public void setUrl(String url) {
	this.url = url;
}
public void setUsername(String username) {
	this.username = username;
}
public void setPassword(String password) {
	this.password = password;
}


@Override
public String toString() {
	return "Drivers [driver=" + driver + ", url=" + url + ", username=" + username + ", password=" + password + "]";
}
public void con() throws ClassNotFoundException, SQLException { 
//Class.forName(driver); 
//Connection con=DriverManager.getConnection(url,username,password);
 System.out.println(driver);
 System.out.println(url);
 System.out.println(username);
 System.out.println(password);


}
}
