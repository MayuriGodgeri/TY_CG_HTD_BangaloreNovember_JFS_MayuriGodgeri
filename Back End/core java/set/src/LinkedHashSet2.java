import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet2
{
	public static void main(String[] args) 
	{
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		l1.add("suchi");
		l1.add("mayu");
		l1.add("nisha");
		l1.add("mayu");
		l1.add(null);
		Iterator itr=l1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
