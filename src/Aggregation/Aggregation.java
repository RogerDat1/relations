package Aggregation;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {
	
	
	public static void main(String args[])
	{
		
		Student s1= new Student("Suhel",12,"Compt");
		Student s2= new Student("Nikita",10,"Compt");
		Student s3= new Student("Lalit",2,"IT");
		Student s4= new Student("Kartik",11,"IT");
	
		List<Student> CSE_students= new ArrayList();
		// Students belonging to computer science 
		
		CSE_students.add(s1);
		CSE_students.add(s2);
		
		/*for(Student name : CSE_students)
		{
			System.out.println(name.Dept);
		}
		*/
		
		// Students belonging to Information technology 
		
		
		List<Student> IT_students= new ArrayList();
		IT_students.add(s3);
		IT_students.add(s4);
	
		
		
		Department comp= new Department("comp",CSE_students);
		Department IT= new Department("IT",IT_students);
		
		List<Department> Departments= new ArrayList();
		Departments.add(comp);
		Departments.add(IT);
		
		
		
       Institution inst= new Institution("Bits",Departments);
       inst.GetNoofStudents();
       
		//obj2.Getstudent();
		
		
	
	}

}
