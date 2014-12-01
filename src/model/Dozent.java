package model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Dozent extends Person
{
	private String personalNr;
	
	public Dozent()
	{
		super();
	}
	

	public Dozent(String name, String lastname, String personalNr) 
	{
		super(name, lastname);
		
		this.personalNr = personalNr;
	}
}