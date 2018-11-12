import java.util.Scanner;

public class Birthday {
	public static void main(String[] args) 
	{
		Scanner user = new Scanner (System.in);
		System.out.print("Please enter a your name: ");
		String firstName = user.nextLine();
		System.out.println("Please enter your birth month as a number: ");
		int firstBirthMonth = user.nextInt();
		System.out.println("Please enter your birth day: ");
		int firstBirthDay = user.nextInt();
		System.out.println("Please enter your birth year: ");
		int firstBirthYear = user.nextInt();
		System.out.print("Please enter the next name: ");
		String secondName = user.nextLine();
		System.out.println("Please enter the next birth month as a number: ");
		int secondBirthMonth = user.nextInt();
		System.out.println("Please enter the next birth day: ");
		int secondBirthDay = user.nextInt();
		System.out.println("Please enter the next birth year: ");
		int secondBirthYear = user.nextInt();
		if (firstBirthYear > secondBirthYear)
		{
			System.out.println(secondName + "is older");
		}
		else if (secondBirthYear > firstBirthYear)
		{
			System.out.println(firstName + "is older");
		}
		else if(firstBirthMonth > secondBirthMonth)
		{
			System.out.println(secondName + "is older");
		}
		else if(secondBirthMonth > firstBirthMonth)
		{
			System.out.println(firstName + "is older");
		}
		else if (firstBirthDay > secondBirthDay)
		{
			System.out.println(secondName + "is older");
		}
		else if (secondBirthDay > firstBirthDay)
		{
			System.out.println(firstName + "is older");
		}
		else 
		{
			System.out.println("Both people are the same age.");
		
		}
	}

}
