import java.util.ArrayList;
import java.util.Collection;

public class Collection2
{
public static void main(String[] args)
{
	Collection c1=new ArrayList();
	c1.add("MAYURI");
	c1.add("GODGERI");
	System.out.println(c1);
	System.out.println(c1.size());
	System.out.println(c1.isEmpty());
	System.out.println(c1.contains("MAYURI"));
}
}
