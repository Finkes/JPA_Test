package dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceUtil 
{
	private static PersistenceUtil instance;
	
	public static EntityManagerFactory factory;
	
	private static final String PERSISTENCE_UNIT_NAME = "courses";
	
	static
	{
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	private PersistenceUtil()
	{
	}
	
	public static PersistenceUtil getInstance()
	{
		if(null == instance)
			instance = new PersistenceUtil();
		
		return instance;
	}	
	
	public EntityManagerFactory getFactory()
	{
		return this.factory;
	}
}
