import java.util.*;
public class Assignment2
{
    public int demo(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public static void main(String args[])
    {
		Scanner sc=new Scanner(System.in);
	    Assignment2 a2=new Assignment2();
		System.out.println("Enter the first number! ");
		int a=sc.nextInt();
		System.out.println("Enter the second number!");
		int b=sc.nextInt();
		System.out.println("The sum of two number is = "+a2.demo(a,b));
	}
}