
public class TestCalci 
{
 public static void main(String[]arr)
 {
	 Calculator c1=new Calculator();
	 int r1=c1.add(56);
	 int r2= c1.add(44,66);
	 double r3=c1.add(45.6);
	 System.out.println(r1);
	 System.out.println(r2);
	 System.out.println(r3);
	 Calculator.multiply(7);
	 Calculator.multiply(44,66);
	 Calculator.multiply(6.7);
			 
 }
}
