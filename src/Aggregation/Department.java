package Aggregation;

import java.util.List;

// Department class contains , list of student as objects 
//List  belongs to collection framework 
// collection is nothing but it is a framework of  abstract classes and inteface. 


public class Department {


	
	private List<Student> student; 
	String name; 
	
	
	Department(String name,List<Student> student)
	{
	  this.name= name; 
	  this.student= student;
	}
	
	public List<Student> Getstudent()
	{
	
	   return student;
	}
	
}
