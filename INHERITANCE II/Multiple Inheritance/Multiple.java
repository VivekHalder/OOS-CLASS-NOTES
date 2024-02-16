//THIS HAS ERRONEOUS CODE
class Parent1
{
	void fun()
	{
		System.out.println("Parent 1");
	}
}

class Parent2
{
	void fun()
	{
		System.out.println("Parent 2");
	}
}

//MULTIPLE INHERITANCE IS NOT ALLOWED IN JAVA
public class Multiple extends Parent1, Parent2{    //ERROR 
	public static void main(String args[])
	{
		Multiple ob=new Multiple();
		ob.fun();
	}
}