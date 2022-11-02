import java.util.Scanner;
class NewSumRange
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int b = input.nextInt();
		int a = input.nextInt();
		int sum = 0;
		sum = b*(b+1)/2-a*(a+1)/2 + a;
		System.out.println(sum);
}
}
