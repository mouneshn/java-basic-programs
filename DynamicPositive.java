import java.util.Scanner;
class DynamicPositive 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number");
		int n1 = input.nextInt();
		if (n1>0)
		{
			System.out.println("positive");
		}
		else
		{
			System.out.println("negative");
		}

	}
}
