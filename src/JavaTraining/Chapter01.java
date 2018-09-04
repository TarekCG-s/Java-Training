package JavaTraining;

import java.util.Scanner;


public class Chapter01 {
	
	
	Scanner scanner;
	
	Chapter01() 
	{
		scanner = new Scanner(System.in);
	}
	
	
	
	public void PairDice() 
	{
		
		int num1 = (int)(Math.random() * 6) + 1;
		int num2 = (int)(Math.random() * 6) + 1;
		
		System.out.println("The first die comes up " + num1);
		System.out.println("The first die comes up " + num2);
		
		System.out.println("The total roll is " + (num1 + num2));
	}
	
	
	public void Greeting() 
	{	
		System.out.print("What's your First name? ");
		String name = scanner.nextLine();
		name = name.toUpperCase();
		System.out.println("Weclome, " + name);
	}
	
	
	public void Change() 
	{
		System.out.print("How much dimes do you own? ");
		int dimes = scanner.nextInt();
		dimes *= 10;
		
		System.out.print("How much nickels do you own? ");
		int nickels = scanner.nextInt();
		nickels *= 5;
		System.out.print("How much pinnies do you own? ");
		int pinnies = scanner.nextInt();
		
		float change = (float)(dimes + nickels + pinnies) / 100;
		
		System.out.println("You own " + change + " Dollars");
	}

	
	public void Eggs() 
	{
		System.out.print("How much eggs do you own? ");
		int eggs = scanner.nextInt();
		
		int gross = eggs / 144;
		eggs -= gross * 144;
		
		int dozens = eggs / 12;
		eggs -= dozens * 12;
		
		System.out.print("You own " + gross + " gross "+ dozens + " dozens and " + eggs + " eggs.");
	}
	
	
	public void Initials() {
		
		System.out.println("Enter your first name and last name, separated by a space.");
		String name = scanner.nextLine();
		
		int index = name.indexOf(" ");
		
		String firstName = name.substring(0, index);
		String lastName = name.substring(index + 1, name.length());
		
		System.out.println("Your first name is " + firstName);
		System.out.println("Your last name is " + lastName);
		
		System.out.println("Your initials are " + (firstName.toUpperCase()).charAt(0) + (lastName.toUpperCase()).charAt(0));
	}
	

}
