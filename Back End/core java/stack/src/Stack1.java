import java.util.Stack;

public class Stack1 
{
public static <E> void main(String[] args) {
	Stack s1=new Stack();
	s1.add(44);
	s1.add(88);
	s1.add(22);
	s1.push(100);
	System.out.println(s1);
	s1.pop();
	System.out.println(s1);
	System.out.println(s1.peek());
	System.out.println(s1);
	System.out.println(s1.search(new Integer(44)));
	
}
}