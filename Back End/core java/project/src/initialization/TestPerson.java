package initialization;

public class TestPerson 
{
  public static void main(String[]arr)
  {
	  Person p1=new Person();
	  p1.age=23;
	  p1.name="Mayuri";
	  p1.personDetail();
	  Person p2=new Person();
	  p2.initialize(12,"kiran" );
	  p2.personDetail();
  }
  
  
}
