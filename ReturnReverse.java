class ReturnReverse 
{
	public static void main(String[] args) 
	{
		int res = reverse(774);
		System.out.println(res);
	}
	public static int reverse(int n)
	{
		int reverse = 0;
		for(int i =1;n!=0;n=n/10)
		{
			int last = n%10;
			reverse = reverse *10+last;

		}
		return reverse;

}
}
