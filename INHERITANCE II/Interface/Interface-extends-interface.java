// an interface can extend other interface:

interface IN1
{
	void getName();
}

interface IN2 extends IN1
{
	void getInstitute();
}

class Diamond1 implements IN2
{
	public void getName()
	{
		System.out.println("RB");
	}
	
	public void getInstitute()
	{
		System.out.println("JU");
	}
	public static void main(String args[])
	{
		Diamond1 ob=new Diamond1();
		ob.getName();
		ob.getInstitute();
	}
	
}