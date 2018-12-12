package ControlStructures;

import java.util.Scanner;

public class FunCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		final long number=sc.nextLong();
		System.out.println("1.Calculate Armstrong");
		System.out.println("2.Calculate Lucky Number");

		final int option=sc.nextInt();
		switch(option) {
		
		case 1:
			calculateArmstrong(number);
			break;
		case 2:
			calculateLuckyNumber(number);
			break;
		default:
			System.out.println("Oops! Invalid choice!");
		
		
		}

	}

	private static void calculateLuckyNumber(long number) {
		// TODO Auto-generated method stub
		long remainder,luckyNumber=0,i=number;
		
		while(i<0) {
			
			remainder=(i%100)%10;
			luckyNumber+=remainder*remainder;
			i/=100;
			
			
		}
		
		if(luckyNumber%9==0)
			System.out.printf("The number %d is a lucky number",number);
		else
			System.out.printf("The number %d is not a lucky number",number);
		
	}

	private static void calculateArmstrong(long number) {
		// TODO Auto-generated method stub
		long remainder,armstrongNumber=0,i=number;
		for( ;i>0;i/=10) 
		{
			
			remainder=i%10;
			armstrongNumber+=remainder*remainder*remainder;
		
			
		}
		
		if(number==armstrongNumber)
			System.out.printf("The number %d is a Armstrong number",number);
		else
			System.out.printf("The number %d is not a Armstrong number",number);
		
	}

}
