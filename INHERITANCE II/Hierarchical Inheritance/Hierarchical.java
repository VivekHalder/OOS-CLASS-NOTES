//first
class Employee
{
	public static int basic=30000;
	
	int salary()
	{
		return basic;
	}
}

class Manager extends Employee
{
	//overrriden version
	int salary()
	{
		return (basic+20000);
	}
}

class Clerk extends Employee
{
	//overrriden version
	int salary()
	{
		return (basic+10000);
	}
}


public class Hierarchical {


	//this method has to be static because we are calling it from the 'static' main.
	static void printSalary(Employee e)
	{
		//IT WILL CALL THE FUNCTION OF THAT CLASS WHICH IS BEING REFERENCED (instantiated)
		//AND NOT OF THE EMPLOYEE CLASS
		//FUNCTION IS CALLED	
		System.out.println(e.salary());
	}

	public static void main(String args[])
	{

		//Run Time Polymorphism

		//RTP is only for methods and not for member variables.

		//Manager is instantiated	
		Employee ob1=new Manager();
		printSalary(ob1); //50000
				
		//Clerk  is instantiated
		Employee ob2=new Clerk();
		printSalary(ob2); //40000
	}

}