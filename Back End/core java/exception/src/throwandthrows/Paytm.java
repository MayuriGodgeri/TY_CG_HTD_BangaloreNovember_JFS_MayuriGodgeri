package throwandthrows;

public class Paytm {
 IRCTC i1;
 public Paytm(IRCTC i1)
 {
	 this.i1=i1;
 }
 void bookTicket()
 {
	 try {
		IRCTC.confirmTicket();
		System.out.println("ticket is confirmed");
	} catch (ClassNotFoundException e) {
		
		System.out.println("ticket is not confirmed");
	}
	 
 }
}
