
public class GoogleMap
{
 void findLocation(String loc)
 {
	 try {
		 System.out.println(loc.length());
	 }
	 catch(NullPointerException n)
	 { 
		 System.out.println("plz fill the loaction");
		 throw n;
	 }
 }
}
