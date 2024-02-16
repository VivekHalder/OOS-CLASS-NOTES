interface IN1
{
	void getName();
}
interface IN2
{
	void getInst();
}
interface IN3 extends IN1, IN2
{
	void getBranch();
}

class Diamond1 implements IN3
{
	public void getName()
	{
		System.out.println("RB");
	}
	public void getInst()
	{
		System.out.println("JU");
	}
	public void getBranch()
	{
		System.out.println("CSE");
	}
    public static void main(String args[])
    {
        Diamond1 ob=new Diamond1();
        ob.getName();
        ob.getInst();
        ob.getBranch();
    }
}