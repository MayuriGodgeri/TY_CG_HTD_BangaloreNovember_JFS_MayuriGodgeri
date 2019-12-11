import java.util.Vector;

public class Vector2 
{
public static void main(String[] args) {
	Vector v1=new Vector();
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("--------after adding element------");
	v1.add(23);
	v1.add(56);
	v1.add(87);
	v1.add(34);
	System.out.println(v1.size());
	System.out.println(v1.capacity());
	System.out.println("------trimtosize-----------");
	v1.trimToSize();
	System.out.println(v1.size());
	System.out.println("-------setsize-------");
	v1.setSize(10);
	System.out.println(v1);
	System.out.println(v1.capacity());
	System.out.println("-----aftr adding------");
	v1.add(500);
	System.out.println(v1);
	System.out.println("-------set------");
	v1.set(5, 399);
	System.out.println(v1);
	System.out.println("size "+v1.size());
	System.out.println("capacity "+v1.capacity());
	
	
}
}
