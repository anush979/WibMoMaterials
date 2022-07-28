package d02valuetype.entity.annotation;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	//@Column(name="DOORNO")
	private String doorNo;
	
	//@Column(name="STREET")	
	private String street;
	
	//@Column(name="AREA")	
	private String area;
	
	//@Column(name="CITY")	
	private String city;
	
	//@Column(name="PIN")	
	private String pin;
	public Address() {}
	public Address(String doorNo, String street, String area, String city, String pin) {
		super();
		this.doorNo = doorNo;
		this.street = street;
		this.area = area;
		this.city = city;
		this.pin = pin;
	}
	public String getDoorNo() {
		return doorNo;
	}
	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	@Override
	public String toString() {
		return doorNo + " " + street + " " + area + " " + city + " " + pin; 
	}
}	