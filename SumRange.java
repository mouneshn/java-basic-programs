import java.util.Scanner;
class SumRange 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int sum = 0 ;
		for(int i = a;i<=b;i++)
		{
			sum = sum + i;
			System.out.println(sum);
		}
	}
}
