import java.util.LinkedList;
import java.util.ListIterator;

public class LinkL
{
public static void main(String[] args)
{
	LinkedList l1=new LinkedList();
	l1.add(2);
	l1.add(6);
	l1.add(5);
	l1.add(2);
	ListIterator itr=l1.listIterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());}
	System.out.println(l1);
	l1.remove(new Integer(2));
	System.out.println(l1);
	
	l1.add(null);
	System.out.println(l1);
	
}
}
