package beans.demo;

import beans.simple.*;

public class BeanClassNDataSource {
	private String driverName;
	private String url;
	private String user;
	private String password;
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void display() {
		System.out.println("***************Externalizing values to properties file***************");
		System.out.println("BeanClassJPropExternal display()");
		System.out.println("Driver Name : " + driverName);
		System.out.println("URL         : " + url);
		System.out.println("USER        : " + user);
		System.out.println("PASSWORD    : " + password);	
	}
}
