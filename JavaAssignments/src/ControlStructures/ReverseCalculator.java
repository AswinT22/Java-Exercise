package ControlStructures;

import java.util.Scanner;

public class ReverseCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		final long numberToBeReversed= sc.nextLong();
		
		
		long remainder,reverse=0,i=numberToBeReversed;
		
		//Using While
		
		while(i>0) {
			remainder=i%10;
			reverse=reverse*10+remainder;
			i/=10;
		}
		System.out.printf("The reverse of a number using while is:%d \n",reverse);
		
		
		//Using Do While
		reverse=0;i=numberToBeReversed;
		do {
			if(i==0)
				break;
			
			remainder=i%10;
			reverse=reverse*10+remainder;
			i/=10;
			
		}while(i>0);
		
		System.out.printf("The reverse of a number using do_while is:%d \n",reverse);
		
		
		reverse=0;
		for(i=numberToBeReversed ;i>0;i/=10) 
		{
			
			remainder=i%10;
			reverse=reverse*10+remainder;
		}
		System.out.printf("The reverse of a number using for is:%d \n",reverse);
	}

}
