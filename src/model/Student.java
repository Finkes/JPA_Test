package model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Student extends Person
{
	private String personalNr;
	
	@ManyToOne()
	private Course course;
	
	public Student()
	{
		super();
	}
	
	public Course getCourse()
	{
		return course;
	}
	
	public void setCourse(Course course)
	{
		this.course = course;
		if(!this.course.getStudents().contains(this))
			this.course.addStudent(this);
	}
	

	public Student(String name, String lastname) 
	{
		super(name, lastname);
	}
}