import java.util.TreeSet;

public class TreeSet1
{
public static void main(String[] args) 
{
	TreeSet t1=new TreeSet();
	t1.add(22);
	t1.add(4);
	t1.add(0);
	t1.add(90);
	t1.add(4);
	for(Object o:t1)
	{
		System.out.println(o);
	}
	
	TreeSet<String> t2=new TreeSet<String>();
	t2.add("mayu");
	t2.add("suchi");
	t2.add("pankaj");
	t2.add("mayuri");
	t2.add("mayu");
	for(Object o1:t2)
	{
		System.out.println(o1);
	}
}
}
