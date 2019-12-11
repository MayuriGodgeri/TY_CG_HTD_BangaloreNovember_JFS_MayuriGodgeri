import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayL 
{
public static void main(String[] args) 
{
	ArrayList<Integer> a1=new ArrayList<Integer>();
	a1.add(10);
	a1.add(20);
	a1.add(30);
	
	System.out.println("------forloop---------");
	for(int i=0;i<a1.size();i++)
		System.out.println(a1.get(i));
	
	System.out.println("------foreachloop---------");
	for(Integer i1:a1)
		System.out.println(i1);
	
	System.out.println("------iterator---------");
	Iterator i2=a1.iterator();
	while(i2.hasNext())
		System.out.println(i2.next());
	
	System.out.println("------listIterator---------");
	ListIterator<Integer> itr= a1.listIterator(a1.size());
	while(itr.hasPrevious())
	{
		System.out.println(itr.previous());
	}
	System.out.println("---------------");
	ArrayList<Integer> a3=new ArrayList<Integer>();
	a3.add(88);
	a3.add(66);
	System.out.println(a3);
	a3.remove(new Integer(88));
	System.out.println(a3);
	}
}


