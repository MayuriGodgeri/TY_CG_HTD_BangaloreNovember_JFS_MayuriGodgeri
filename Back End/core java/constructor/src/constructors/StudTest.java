package constructors;

public class StudTest
{
	public static void main(String[] arr)
	{
		Student s=new Student();
		Student s1=new Student("Mayu",22);
		System.out.println(s1.studName);
		System.out.println(s1.studAge);
		System.out.println(s.studName);
		System.out.println(s.studAge);
	}
	
}
