/*
    generally, if an interface has a function and it has a body, then default keyword is must.
    else, this error is thrown =>  interface abstract methods cannot have body 


    In Java, interfaces can't have method bodies by default. However, starting from Java 8, 
    the default keyword allows interfaces to have method implementations. The purpose of 
    using default keyword is to provide a default implementation for a method within an 
    interface.
*/

/*
 * This is how we can find a way out to implement Multiple Inheritance in Java.
 */

interface IN1
{
	default void fun()
	{
		System.out.println("Interface 1");
	}
}

interface IN2
{
	default void fun()
	{
		System.out.println("Interface 2");
	}
}


public class Multiple implements IN1, IN2{
	
	public void fun()
	{
        //even with the default implementation, the interface cannot be instantiated.
        //IN1 i = new IN1();

		System.out.println("Multiple");

        //there is an ambiguity. How to call a specific version of fun()?

        //we use the specific interface name and use the super keyword to call that specific 
        //function
		IN1.super.fun();  //ambiguity resolution
		IN2.super.fun();  //ambiguity resolution
	}
	
	public static void main(String args[])
	{
		Multiple ob=new Multiple();
		ob.fun();
	}

}