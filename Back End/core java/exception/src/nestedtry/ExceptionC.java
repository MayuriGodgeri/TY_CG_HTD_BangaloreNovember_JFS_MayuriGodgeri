package nestedtry;

public class ExceptionC 
{
public static void main(String[] args)
{
	System.out.println("main started");
	Employee e1=new Employee();
	try {
		Object o1=e1.clone();
		try {
			Class c1=Class.forName("nestedtry.Employee");
			System.out.println("class found");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("class not found");
		}
	}
	catch(CloneNotSupportedException e2)
	{
		System.out.println("clone not supported");
	}
	System.out.println("main started");
}
}
