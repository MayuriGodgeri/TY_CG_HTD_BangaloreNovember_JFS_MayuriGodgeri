package checkedexceptionpropagation;

public class A {
public static void main(String[] args) {
	System.out.println("main started");
	try
	{ 
	B.m();
	
	}
	catch(ClassNotFoundException c)
	{
		System.out.println("class not found");
	}
	System.out.println("main ended");
}
}
