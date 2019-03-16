package Associations;

public class Association {
	
	//Association to class , is two classe or object can have a relations as 
	 //1 2 1 , 1 2 many , many 2 1 , and manty 2 many 
	
	public static void main(String args[])
	{
		
		Bank Obj1= new Bank("HDFC");
		Employees Obj2= new Employees("Lalit");
		
		System.out.println("The bank name is "+Obj1.BankName());
		System.out.println("The Employee name is "+Obj2.EmployeeName() );  
		
	}

}
