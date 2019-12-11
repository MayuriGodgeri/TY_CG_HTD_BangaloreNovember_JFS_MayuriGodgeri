package PACK;
import java.util.Scanner;


public class phone 
{
	static int current_charge;
 public static void main(String[]args)
 {
	Scanner scn1=new Scanner(System.in);
	System.out.println("Enter current charge");
	current_charge=scn1.nextInt();
	 mobile m1=new mobile();
	 
	 m1.watching_video();
	 m1.calling();
	 m1.plug();
	 
	 
 }
}

