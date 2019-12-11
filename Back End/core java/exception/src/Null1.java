
public class Null1 
{
 private String s1;

void write()
 {
	 s1 = null;
	 try {
	 System.out.println(s1.length());
	 }
	 catch(NullPointerException e)
	 {
		 System.out.println("dont deal with null");
	 }
 }
}
