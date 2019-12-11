package customchecked;

public class Person
{
public static void main(String[] args)
{
	Election e=new Election();
	try {
	e.vote(17);
	}
	catch(AgeLimitException e1)
	{
		System.out.println(e1.getMessage());
	}
}
}
