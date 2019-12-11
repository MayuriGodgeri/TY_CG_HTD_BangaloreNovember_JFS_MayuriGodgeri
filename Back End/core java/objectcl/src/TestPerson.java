
public class TestPerson
{
public static void main(String[] args) throws Throwable 
{
	System.out.println("----pgm started----");
	Person p=new Person("mayu");
	p.finalize();
	p=null;
	System.gc();
	System.out.println("----pgm ended----");
}
}
