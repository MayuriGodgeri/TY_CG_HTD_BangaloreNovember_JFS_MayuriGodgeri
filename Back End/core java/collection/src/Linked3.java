import java.util.LinkedList;

public class Linked3 
{
public static void main(String[] args)
{
	
	 LinkedList l1=new LinkedList(); 
	 l1.add(67);
	 l1.add(29);
	 l1.add(84);
	 l1.add(29);
	 System.out.println(l1);
	 System.out.println("------peek and peekfirst and peeklast-----------");
	 System.out.println(l1.peek());
	 System.out.println(l1.peekFirst());
	 System.out.println(l1.peekLast());
	 System.out.println("------poll and pollfirst and polllast-----");
	 l1.poll();
	 System.out.println(l1);
	 l1.pollFirst();
	 System.out.println(l1);
	 l1.pollLast();
	 System.out.println(l1);
	 System.out.println("---------offer and offerfirst and offerlast----------");
     l1.offer(45);
     l1.offerFirst(66);
     l1.offerLast(100);
     System.out.println(l1);
	 }
}
