import java.util.Scanner;
class DynamicPrime 
{
	public static void main(String[] args) 
	{
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number");
	int n1 = input.nextInt();
	int count = 0;
	for(int i =1;i<=n1;i++)
	{
		if(n1%i==0)
		{
			count++;
		}
	}
		if (count==2)
		{
			System.out.println("pm");
		}
		else
		{
			System.out.println("npm");
		}
	
}
}

