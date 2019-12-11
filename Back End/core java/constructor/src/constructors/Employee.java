package constructors;

public class Employee
{
	String empName;
	int empAge;
	double empSal;
	Employee(String name,int age,double sal)
	{
		empName=name;
		empAge=age;
		empSal=sal;
	}
void detail()
{
	System.out.println("name" +empName+" age "+empAge+ " salary "+empSal);
}
}
