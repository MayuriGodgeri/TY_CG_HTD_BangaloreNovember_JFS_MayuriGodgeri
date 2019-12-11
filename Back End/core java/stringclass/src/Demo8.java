
public class Demo8
{
public static void main(String[] args)
{
	StringBuffer s1=new StringBuffer("mayu");
	System.out.println(s1.hashCode());
	s1=s1.append("Godgeri");
	System.out.println(s1.hashCode()); //hashcode will same for both sing stringbuffer is mutable
}
}
