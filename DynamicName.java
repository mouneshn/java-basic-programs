import java.util.Scanner;
class DynamicName 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name =input.next();
		System.out.println("Enter your age");
        int age = input.nextInt();
		System.out.println(name);
		System.out.println(age);
	}
}
