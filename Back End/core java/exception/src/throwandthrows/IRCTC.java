package throwandthrows;

public class IRCTC 
{
 static void confirmTicket() throws ClassNotFoundException
 {
	 try
	 {
		 Class.forName("throwandthrows.Paytm");
		 System.out.println("ticket is confirmed");
	 }
	 catch(ClassNotFoundException e)
	 {
		 System.out.println("ticket is not confirmed");
		 throw e;
	 }
 }
}
