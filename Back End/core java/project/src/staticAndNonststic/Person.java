package staticAndNonststic;

public class Person {
	static int age;
	String name;
	
	void personDetails()
	{
		System.out.println("Student name is "+name +" and age is "+age);
		personDetailsStaic();
	}
	static void personDetailsStaic()
	{
		System.out.println(age);
	}
	
	

}
