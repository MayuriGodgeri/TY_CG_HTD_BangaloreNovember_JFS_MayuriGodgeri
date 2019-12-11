
public class Test 
{
public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException 
{
	ClasssGet c=new ClasssGet("Mayu");
	Class c1=c.getClass();
	System.out.println(c1);
	System.out.println(c.getClass());
	
	//another way to create an object
	ClasssGet c2=(ClasssGet) c1.newInstance(); //downcasting
	System.out.println(c2.name);
	
	Class c3= Class.forName("ClasssGet");
	System.out.println(c3);
}
}
