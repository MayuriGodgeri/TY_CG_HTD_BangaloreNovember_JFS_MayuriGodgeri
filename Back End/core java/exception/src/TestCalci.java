
public class TestCalci
{
public static void main(String[] args)
{
	System.out.println("main started");
	Calculator c1=new Calculator();
	   c1.divide(10,0);
	   System.out.println("-------------------------");
	   c1.divide(10,2);
    System.out.println("main ended");		
}
}
