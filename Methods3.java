class Methods3 
{
	public static void main(String[] args) 
	{
		lastDigit(7387);
		lastDigit(75238);
		lastDigit(8710
			6);
		addition(2,6,8);
		string("mounesh",7);
	}
	public static void lastDigit(int n1)
	{
		int res = n1%10;
		System.out.println(res);
	}
	public static void addition(int n1 , int n2, int n3)
	{
		int res1 = n1 +  n2 + n3;
		System.out.println(res1);
	}
	public static void string(String s , int n1)
	{
		for(int i = 1;i<=n1;i++)
		{
			System.out.println(s);
		}
	}
}
