package main;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

import dao.PersistenceUtil;
import model.Address;
import model.Course;
import model.Dozent;
import model.Person;
import model.Student;

public class Program 
{
	  public static void main(String[] args) 
	  {
		  EntityManager entityManager = PersistenceUtil.getInstance().getFactory().createEntityManager();

		  Course course = new Course("TINF12B1");
	    
		  Student student = new Student("Dominik", "Finkbeiner");
		  student.setBirthday(new GregorianCalendar(1993, 6, 11).getTime());
		  student.setHomeAddress(new Address("Minneburgstraße", "Mosbach", "74821"));
		  
		  course.addStudent(student);
		  
		  Dozent dozent = new Dozent("Peter", "Valenta", "P1");
	    
		  try
		  {
			  entityManager.getTransaction().begin();
			  entityManager.persist(student);
			  entityManager.persist(dozent);
			  entityManager.persist(course);
			  entityManager.getTransaction().commit();
		  }
		  catch(PersistenceException ex)
		  {
			  entityManager.getTransaction().rollback();
		  }
		 
		  entityManager.close();
			
		  System.out.println("finish");
	  }
}