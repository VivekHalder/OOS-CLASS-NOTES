//Static import: [allows us to access the static member of a class directly without using the fully ______________ qualified name. It is used for saving the time by typing less.]
import static java.lang.System.*;
import static java.lang.Math.*;

public class StaticImport {

	public static void main(String args[])
	{
		out.println("Hello");
		double r1=sqrt(26.0);
		double r2=tan(60);
		double r3=log(2);
		out.println(r1);
		out.println(r2);
		out.println(r3);
	}
}