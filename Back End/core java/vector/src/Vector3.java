import java.util.Vector;

public class Vector3
{
	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.addElement(23);
		v1.addElement(56);
		v1.addElement(87);
		v1.add(34);
		System.out.println(v1);
		v1.removeElement(56);
		System.out.println(v1);
		v1.removeElementAt(2);
		System.out.println(v1);
		
		Object o1[]=new Object[v1.size()];
		v1.copyInto(o1);
		for(int i=0;i<o1.length;i++)
		{
		System.out.println(o1[i]);	
		}
		v1.removeAllElements();
		System.out.println(v1);
		System.out.println("-------------------------------");
		Vector v2=new Vector();
		v2.addElement(23);
		v2.addElement(56);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println("------trimtosize--------");
		v2.trimToSize();
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println("------when size is less than ensurecapacity");
		v2.ensureCapacity(6);
		v2.setSize(4);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		System.out.println("------when size is greater than ensurecapacity");
		v2.ensureCapacity(6);
		v2.setSize(8);
		System.out.println(v2.size());
		System.out.println(v2.capacity());
		
		
	}	
}
