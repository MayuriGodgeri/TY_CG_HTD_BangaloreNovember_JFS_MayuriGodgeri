package com.atmma;
import java.util.Scanner;
public class card {
	static double amt;
	final long card_number=123456789l;
	final int cvv=654;
	final int pin=1234;
	double accbal=20000.00;
	double minbal=1000.00;
    void debit()
    {
    	if(card_number==atm.c1 && cvv==atm.c2 && pin==atm.p1)
    	{
    		System.out.println("successfully logged in");
    		Scanner scn1=new Scanner(System.in);
    		System.out.println("Enter the amount to be withdraw");
    	    amt=scn1.nextDouble();
    		if(accbal>=minbal && amt<=accbal)
    		{
    			System.out.println("withrawing RS"+amt);
    			accbal=accbal-amt;
    			System.out.println("Remaining account balance is "+accbal);
    			
    		}
    		else
    			System.out.println("Insufficient balance, Try later");
    		
    	}
    	
    	else
    		System.out.println("Invalid details");
    }
    void withdrw()
	{
		Scanner scn1=new Scanner(System.in);
		System.out.println("Enter the amount to be withdraw");
	    amt=scn1.nextDouble();
		if(accbal>=minbal && amt<=accbal)
		{
			System.out.println("withrawing RS"+amt);
			accbal=accbal-amt;
			System.out.println("Remaining account balance is"+accbal);
			
		}
		else
			System.out.println("Insufficient balance, Try later");
    }
     
}
