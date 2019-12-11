import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayStr 
{
public static void main(String[] args)
{
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("mayuri");
	a1.add("godgeri");
	a1.add(1,"mayuri");
	
	
	System.out.println("------forloop---------");
	for(int i=0;i<a1.size();i++)
		System.out.println(a1.get(i));
	
	System.out.println("------foreachloop---------");
	for(String i1:a1)
		System.out.println(i1);
	
	System.out.println("------iterator---------");
	Iterator i2=a1.iterator();
	while(i2.hasNext())
		System.out.println(i2.next());
	
	System.out.println("------listIterator---------");
	ListIterator<String> itr= a1.listIterator(a1.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	System.out.println("-----removed--------");
	System.out.println(a1.remove(2));
}
}
