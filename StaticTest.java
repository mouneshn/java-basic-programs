class StaticTest 
{
	static  String name = "laila";
	public static void main(String[] args) 
	{
		String name = "maala";
		System.out.println(name);
		System.out.println(StaticTest.name);
		m1();
	}
	public static void m1()
	{
		System.out.println(name);
	}
}
