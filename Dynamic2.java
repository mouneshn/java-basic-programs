import java.util.Scanner;
class Dynamic2
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a key");
		int n1 = input.nextInt();
		System.out.println("Enter another number");
		int n2 = input.nextInt();
		System.out.println(" the gretest number is");
		if(n1>n2)
		{
			System.out.println(n1);
		}
		else
		{
			System.out.println(n2);
		}
	}
}
