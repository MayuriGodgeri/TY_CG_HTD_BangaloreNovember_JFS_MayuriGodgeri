package checkedexception;

public class ExceptionA 
{
public static void main(String[] args) {
	try {
	Class c1= Class.forName("checkedexception.Person");
	System.out.println("class found");
	}
	catch(ClassNotFoundException e) {
		System.out.println("class not found");
	}
}

}
