class  Sb4
{
	static char ch ='k';	//static variable
	static
	{
		char ch ='s';	//local variable
		System.out.println (ch);
		ch='m';
		System.out.println(ch);
	}
	public static void main(String[] args) 
	{
		System.out.println(ch);
	}
}
