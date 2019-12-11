
public class Demo1 
{
public static void main(String[] args) 
{
	String s1="mayu";
	System.out.println(s1.hashCode());
	String s2="kiru";
	s1="milu";
	System.out.println(s1.hashCode());
	String s3="mayu";
	System.out.println(s3.hashCode());
	
}
}
