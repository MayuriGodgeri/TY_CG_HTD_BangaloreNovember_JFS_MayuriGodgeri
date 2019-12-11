package checkedexception;

public class ExceptionB 
{
 public static void main(String[] args) {
	 System.out.println("main started");
	 Student s1=new Student();
	try {
		Object o1= s1.clone();
		System.out.println("object cloned");
		Class c1= Class.forName("checkedexception.Student");
	}
	catch(ClassNotFoundException e)
	{
		System.out.println("class not found");
	}
	catch(CloneNotSupportedException e1)
	{
		System.out.println("object not cloned");
	}
	System.out.println("main started");
}
}
