/*
    * What is method overriding?
            Method overriding means subclass had defined an instance method with the same signature 
            and return type as the instance method in the superclass. In such a case, method of the 
            superclass is overridden (replaced) by the subclass.

            It happens because static methods are resolved at compile time.
*/

/*
  * Methods in Static Context
        Static methods are bonded during compile time using types of reference variables not
        object. We know that static methods are accessed by using the class name rather than
        an object. Note that the static method can be overloaded, but cannot be overridden in
        Java.
*/
 

class Demo  
{  
    public static void method1()  
    {  
        System.out.println("Method-1 of the Demo class is executed.");  
    }  
    public void method2()  
    {  
        System.out.println("Method-2 of the Demo class is executed.");  
    }  
}  

public class Main extends Demo  
{  
    public static void method1()  
    {  
        System.out.println("Method-1 of the Sample class is executed.");  
    }  
    public void method2()  
    {  
        System.out.println("Method-2 of the Sample class is executed.");  
    }  
    public static void main(String args[])  
    {  
        Demo d1 = new Demo();  
        //d2 is reference variable of class Demo that points to object of class Sample  
        Demo d2 = new Main();  
        //method calling with reference (method hiding)  
        d1.method1();  
        d2.method1();  
        //method calling with object (method overriding)  
        d1.method2();  
        d2.method2();  
    }  
}

/*
 * Method Hiding	                        Method Overriding
    
    Both methods must be static.	            Both methods must be non-static.
    
    Method resolution takes care by the 	    Method resolution takes care by JVM based on compiler based on the reference type.      runtime object.

    It is considered as compile-time           It is considered as runtime polymorphism or	
    polymorphism or static polymorphism        
    or early binding.
 */