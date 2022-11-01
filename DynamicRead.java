import java.util.Scanner;

import java.util.Scanner;
class DynamicRead{
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    System.out.println("enter an integer number");
    int n1 =input.nextInt();
    System.out.println("enter another integer number");
    int n2 =input.nextInt();
    if(n1>n2)
    System.out.println(n1+"is gretest");
    else{
        System.out.println(n2 + "is gretest");
    }
}
}