import java.util.Scanner;

public class Palindrome 
{
	public static void main(String[] args) 
	{
		String reverse="";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String to check palindrome");
		String input=sc.nextLine();
		int length=input.length();
		
		for(int i=length-1;i>=0;i--)
		{
			reverse=reverse+input.charAt(i);
			System.out.println(reverse);
		}
		System.out.println("INput:"+input);

		System.out.println("output:"+reverse);
		if(input.equalsIgnoreCase(reverse))
		{
			System.out.println("It is Palindrome");
		}
		else 
			System.out.println("Not Palindrome");
		
	}
}