package JavaTraining;

import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Chapter02 {

	Scanner scanner;
	
	Chapter02() 
	{
		scanner = new Scanner(System.in);
	}
	
	
	
	public void Birthdays() 
	{
		
		boolean[] used = new boolean[365];
		int count = 0;
		
		while(true) 
		{
			count++;
			int birthday = (int)(Math.random() * 365);
			
			if (used[birthday] == true) 
			{
				System.out.printf("We have found matching after %d tries.", count);
				break;
			}
			
			used[birthday] = true;
		}
	}
	
	public void MaxDivisor() 
	{
		int maxDivisor = 0;
		int numWithMax = 1;
		
		for (int i = 1; i <= 10000; i++) 
		{
			int curDivisors = 0;
			for(int j = 1; j <= i; j++) 
			{
				if(i % j == 0) curDivisors++;
			}
			if(curDivisors >= maxDivisor) 
			{
				maxDivisor = curDivisors; 
				numWithMax = i;
			}
			
		}
		
		System.out.printf("The number %d has that maximum number of divisors which is %d", numWithMax, maxDivisor);
	}

}
