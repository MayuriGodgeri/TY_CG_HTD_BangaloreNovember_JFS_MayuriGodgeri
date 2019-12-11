
public class Calculator
{
 int add(int a)
 {
 return a+a;
 }
 int add(int a,int b)
 {
 return a+b;
 }
double add(double a)
 {
 return a+a;
 }
//static overloading
static void multiply(int a)
{
	System.out.println("multiplication result is "+(a*a));
	
}
static void multiply(int a,int b)
{
	System.out.println("multiplication result is "+(a*b));
	
}
static void multiply(double a)
{
	System.out.println("multiplication result is "+(a*a));
	
}
}
