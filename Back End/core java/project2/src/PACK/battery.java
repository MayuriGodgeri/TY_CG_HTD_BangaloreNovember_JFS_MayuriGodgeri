
package PACK;

public class battery 
{

  final int upper_limit=100;
  final int lower_limit=5;
   
  void discharge()
  {
	  if(phone.current_charge<=lower_limit)
		  System.out.println("Battery is dead");
	  else
		  System.out.println("current capacity of Battery :"+phone.current_charge);
  }
   
  void charge()
  {
	  if(phone.current_charge==upper_limit)
		  System.out.println("battery is fully charged");
	  else
		  System.out.println("current capacity of Battery :"+phone.current_charge);
  }
   
}
