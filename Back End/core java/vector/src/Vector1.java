import java.util.Vector;

public class Vector1
{
public static void main(String[] args) {
	Vector v1=new Vector();
	v1.add(11);
	v1.add(9);
	v1.add(87);
	v1.add(34);
	System.out.println("----forloop-------");
	for(int i=0;i<v1.size();i++)
	{
		System.out.println(v1.get(i));
	}
	v1.set(1,100);
	System.out.println(v1);
	
	
}
}
