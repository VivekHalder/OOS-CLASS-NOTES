import java.util.*;   // Both the packages have a class
import java.sql.*;    // Date; ambiguous case

// public class SystemPackConflict {
// 	public static void main(String args[])
// 	{
// 		Date ob=new Date();
// 	}

// }
// ___________________________________________________

public class SystemPackConflict {
	public static void main(String args[])
	{
		java.util.Date ob1=new java.util.Date();
		java.sql.Date ob2=new java.sql.Date(System.currentTimeMillis()); //2024-02-22
		System.out.println(ob2);
	}

}