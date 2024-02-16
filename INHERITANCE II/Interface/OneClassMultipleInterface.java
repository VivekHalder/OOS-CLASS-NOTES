/*
 * In Java, if you don't specify an access modifier for methods in a class, they default to
 *  package-private (also known as default access level). Package-private methods are 
 * accessible only within the same package.
 * So, if you omit the public modifier from the methods in the Interface class that implement
 * the IN1 and IN2 interfaces, they will be package-private by default. However, this will
 * cause compilation errors because interface methods are implicitly public, and when you 
 * implement them in a class, you must provide a matching access level, which is public.
 */

interface IN1
{
	void fun1();
}

interface IN2
{
	void fun2();
}

class Interface implements IN1, IN2
{
	public void fun1()
	{
		System.out.println("FUN1");
	}
	public void fun2()
	{
		System.out.println("FUN2");
	}
	
}

class Diamond1 
{
	public static void main(String args[])
	{
		Interface ob=new Interface();
		ob.fun1();
		ob.fun2();
		
	}
}