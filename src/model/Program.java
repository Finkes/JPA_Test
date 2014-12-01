package model;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Program {
	
	  private static final String PERSISTENCE_UNIT_NAME = "courses";
	  private static EntityManagerFactory factory;

	  public static void main(String[] args) 
	  {
	    factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	    EntityManager em = factory.createEntityManager();
	    // read the existing entries and write to console
//	    Query q = em.createQuery("select t from Todo t");
//	    List<Todo> todoList = q.getResultList();
//	    for (Todo todo : todoList) {
//	      System.out.println(todo);
//	    }
//	    System.out.println("Size: " + todoList.size());
	    
	   
	    // create new todo
	    em.getTransaction().begin();
	    
	    Person p = new Person("Dominik", "Finkbeiner");
	    em.persist(p);
	    em.getTransaction().commit();

	    em.close();
	    
	    System.out.println("finish");
	  }

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		EntityManager em = 
//	}

}
