package Aggregation;

import java.util.List;

public class Institution {
	
    String name;
    int cnt=0;
    
	private List<Department> Departments;
	Institution(String name,List<Department> Departments)
	{
		this.name=name;
		this.Departments=Departments;
	}
	
	public void GetNoofStudents()
	{
		//Department values;
		List<Student> s;
		for(Department values: Departments)
		{
			s=values.Getstudent();
			for(Student s1 : s )
			{
				cnt++;
				
			}
			
		}
		//System.out.println(values);
		System.out.println(cnt);
	}
}
