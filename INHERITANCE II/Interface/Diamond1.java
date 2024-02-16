//an interface always extends an interface
//whereas a class always implements an interface.

interface GIN
{
	default void show()
	{
		System.out.println("GIN1");
	}
}

interface IN1 extends GIN
{
    /*
        default void show()
        {
            System.out.println("GIN1");
        }
        error, since two shows will be present in IN1
    */
}

interface IN2 extends GIN
{
    /*
        default void show()
        {
            System.out.println("GIN1");
        }
        error, since two shows will be present in IN2
    */
}

class Diamond1 implements IN1, IN2
{
	public static void main(String args[])
	{
		Diamond1 d=new Diamond1();
		d.show();
	}
}