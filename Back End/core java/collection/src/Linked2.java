import java.util.LinkedList;

public class Linked2 
{
 public static void main(String[] args) {
	 
	 LinkedList l1=new LinkedList(); 
	 l1.add(67);
	 l1.add(29);
	 l1.add(84);
	 l1.add(29);
	 System.out.println(l1);
	 System.out.println("------remove()----------");
	 l1.remove();
	 System.out.println(l1);
	 System.out.println("------removefirst() and removelast()----------");
	 l1.removeFirst();
	 l1.removeLast();
	 System.out.println(l1);
	 System.out.println("----------------");
	 LinkedList l2=new LinkedList(); 
	 l2.add(38);
	 l2.add(91);
	 l2.add(28);
	 l2.add(38);
	 System.out.println(l2);
	 System.out.println("getfirst "+l2.getFirst());
	 System.out.println("getlast "+l2.getLast());
	 System.out.println("-------removefirstoccurance and removelastoccurance-------");
	 l2.removeFirstOccurrence(38);
	 l2.removeLastOccurrence(38);
	 System.out.println(l2);
}
}
