package initialization;

public class Person 
{
  int age;
  String name;
  void personDetail()
  {
	  System.out.println("name "+name+" age "+age);
  }
  void initialize(int a,String n)
  {
	name=n;
	age=a;
  }
  
}
