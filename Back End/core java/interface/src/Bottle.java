
public interface Bottle
{
  void open();
  void drink();
  default void juice()
  {
	  System.out.println("Fanta juice");
  }
  static void close()
  {
 	 System.out.println("closing the bottle");
  }

}
