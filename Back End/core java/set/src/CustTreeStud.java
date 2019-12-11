import java.util.Iterator;
import java.util.TreeSet;

public class CustTreeStud 
{
public static void main(String[] args) {
	StudAgetree s1=new StudAgetree();
	TreeSet<Student> t1=new TreeSet<Student>(s1);
	t1.add(new Student(22,"mayu"));
	t1.add(new Student(6,"ponkya"));
	t1.add(new Student(22,"suchi"));
	t1.add(new Student(56,"nisha"));
	
	Iterator<Student> itr=t1.iterator();
	while(itr.hasNext())
		
	{
		System.out.println(itr.next());
	}
	
}
}
