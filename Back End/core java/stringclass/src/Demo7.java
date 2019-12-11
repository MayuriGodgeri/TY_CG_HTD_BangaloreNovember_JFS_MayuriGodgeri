
public class Demo7 
{
 public static void main(String[] args) 
{
	String s1=new String("mayu ");
	String s2=new String("sonu");
	String s3=new String("uday");
	System.out.println(s1.hashCode());
	s1=s1.concat("Godgeri");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1.hashCode()); //hashcode will be differnt since string is immutable
}
}
