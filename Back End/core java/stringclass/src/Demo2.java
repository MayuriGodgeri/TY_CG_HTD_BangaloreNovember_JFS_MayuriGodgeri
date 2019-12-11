
public class Demo2
{
	public static void main(String[] args) {
		
	
String s1=new String("mayu");
System.out.println(s1.hashCode());
String s2=new String("kiru");
String s3=new String("mayu");
s1=new String("milu");
System.out.println(s1.hashCode());
System.out.println(s2.hashCode());
System.out.println(s3.hashCode());
}
}