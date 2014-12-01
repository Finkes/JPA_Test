package main;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dao.PersistenceUtil;
import model.Address;
import model.Dozent;
import model.Person;

public class Program 
{
	  public static void main(String[] args) 
	  {
		  EntityManager entityManager = PersistenceUtil.getInstance().getFactory().createEntityManager();

		  entityManager.getTransaction().begin();
	    
		  Person person = new Person("Dominik", "Finkbeiner");
		  person.setBirthday(new GregorianCalendar(1993, 6, 11).getTime());
		  person.setHomeAddress(new Address("Minneburgstraße", "Mosbach", "74821"));
		  
		  Dozent dozent = new Dozent("Peter", "Valenta", "P1");
	    
		  entityManager.persist(person);
		  entityManager.persist(dozent);
		  entityManager.getTransaction().commit();
		  entityManager.close();
			
		  System.out.println("finish");
	  }
}