import java.util.LinkedList;

public class Linked4
{
public static void main(String[] args)
{
	LinkedList l1=new LinkedList(); 
	 l1.add(67);
	 l1.add(29);
	 l1.add(84);
	 l1.add(29);
	 System.out.println(l1);
	 System.out.println("---push----");
	 l1.push(100);
	 System.out.println(l1);
	 System.out.println("---pop-----");
	 l1.pop();
	 System.out.println(l1);
	 System.out.println("-----element----");
	 System.out.println(l1.element());
	 System.out.println(l1);
}
}
