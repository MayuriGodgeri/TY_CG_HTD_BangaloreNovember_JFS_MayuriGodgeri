
public class Crush extends Phone 
{
	void receive( Phone p)
{
 if(p instanceof BasicSet)
 {
	 System.out.println("Thanks");
 }
 else if(p instanceof Oppo)
 {
	 System.out.println("Thank you");
 }
 else if(p instanceof OnePlus)
 {
	 System.out.println("Thank you so much");
 }
 else if(p instanceof Apple)
 {
	 System.out.println("love you");
 }
 else
 {
	 System.out.println("Idiot");
 }
}
}