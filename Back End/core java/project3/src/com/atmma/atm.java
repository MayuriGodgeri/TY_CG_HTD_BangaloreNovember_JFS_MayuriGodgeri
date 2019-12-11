package com.atmma;
import java.util.Scanner;
public class atm {
	static long c1;
	static int c2;
	static int p1;
	public static void main(String[] args)
	{
		
		card c=new card();
		Scanner scn1=new Scanner(System.in);
		System.out.println("Enter card number");
		c1=scn1.nextLong();
		System.out.println("Enter CVV");
		c2=scn1.nextInt();
		System.out.println("Enter pin");
		p1=scn1.nextInt();
		c.debit();
	
		
	}	


}
