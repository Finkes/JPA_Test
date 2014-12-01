package model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person 
{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private String lastname;
  
  public Person()
  {

  }
  
  public Person(String name, String lastname)
  {
	  this.name = name;
	  this.lastname = lastname;
  }
  
}