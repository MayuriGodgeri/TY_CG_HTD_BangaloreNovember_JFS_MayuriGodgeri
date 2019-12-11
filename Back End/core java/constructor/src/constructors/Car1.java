package constructors;

public class Car1 extends Vehicle 
{
  int cost=200000;
  void carDetails()
  {
	  int cost=8000;
	  System.out.println("local variable cost is"+cost);
	  System.out.println("global variable cost is"+this.cost);
	 // System.out.println("super class variable cost is"+super.cost);
  }
}
