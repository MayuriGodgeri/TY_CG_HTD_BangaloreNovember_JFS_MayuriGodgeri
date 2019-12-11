import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustLinkedEmployee 
{
public static void main(String[] args) {
	
	LinkedHashSet<Employee> l1=new LinkedHashSet<Employee>();
	l1.add(new Employee(23,"suchi"));
	l1.add(new Employee(22,"mayu"));
	l1.add(new Employee(20,"nisha"));
	l1.add(new Employee(22,"mayu"));
	
	Iterator<Employee> itr=l1.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
}
}
