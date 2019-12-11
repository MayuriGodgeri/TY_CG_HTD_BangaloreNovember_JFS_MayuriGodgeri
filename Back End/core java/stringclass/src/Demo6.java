
public class Demo6 
{
public static void main(String[] args)
{
	Demo5 d1=new Demo5("mayu",22);
	System.out.println(d1.hashCode());
	 d1=new Demo5("kiru",22);
	System.out.println(d1.hashCode());
	int age=d1.getAge()	;
	String name=d1.getName();
	System.out.println(name);
	System.out.println(age);
}
}
