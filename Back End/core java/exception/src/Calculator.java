
public class Calculator
{
 void divide(int a,int b)
 {
	 System.out.println("dividing a by b");
	 try {
	 System.out.println(a/b);
	 }
	 catch(ArithmeticException e) {
	 System.out.println("cannot divide by zero");
	 }
 }
}
