package model;

import javax.persistence.Embeddable;

@Embeddable
public class Address 
{
	private String street;
	private String city;
	private String zipCode;

	public Address()
	{
	}
	
	

	public Address(String street, String city, String zipCode) {
		super();
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
	}
	
	
}
