class Sb3 
{
	static int n1 = 420;
	static
	{
		int n1 = 120;
		m1();
	}
	public static void main(String[] args) 
	{
		
		System.out.println(n1);
	}
	public static void m1()
	{
		n1 = 34;
		System.out.println(n1);
		m2();
	}
	public static void m2()
	{
		System.out.println(n1);
	}
}
