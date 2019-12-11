
public class InstanceBlock 
{

final int MAXIMUM;
static final double PI;
InstanceBlock()
{
	
	System.out.println("constructor block");
}
{
	this.MAXIMUM=30000;
	System.out.println("Instance block");
	System.out.println(MAXIMUM);
}
static
{
	System.out.println("Static block");
	PI=3.14;
	System.out.println(PI);	
}

}
