import java.util.ArrayList;
import java.util.Collection;

public class Collection3
{
public static void main(String[] args)
{
 Collection c1= new ArrayList();
 c1.add(12);
 c1.add(13);
 c1.add(14);
 System.out.println(c1);
 Collection c2= new ArrayList();
 c2.add(12);
 c2.add(16);
 c2.add(15);
 System.out.println(c2);
 System.out.println("------addAll-------");
 c1.addAll(c2);
 System.out.println(c1);
 System.out.println("-----removeAll------");
 c1.removeAll(c2);
 
 c1.add(12);
 System.out.println("c1 " +c1);
 System.out.println("c2 "+c2);
 
 
 System.out.println("----retainsAll------");
 c1.retainAll(c2);
 System.out.println(c1);
 System.out.println( " containsAll "+c1.containsAll(c2));
 c1.clear();
 
 System.out.println("----------------");
 Collection c3= new ArrayList();
 c3.add(12);
 c3.add(13);
 c3.add(14);
 Object o[]=c3.toArray();
 for(int i=0;i<o.length;i++)
 {
	 System.out.println(o[i]);
 }
}
}
