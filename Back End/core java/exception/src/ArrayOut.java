
public class ArrayOut
{
 public static void main(String[] args)
 {
	System.out.println("main started");
	int a1[]=new int[4];
	a1[0]=1;
	a1[1]=2;
	a1[2]=3;
	a1[3]=4;
	try {
    a1[4]=5;
    }
	catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println("no space available");
	}
	
	System.out.println("main ended");
}
}
