import java.util.ArrayList;
import java.util.List;

public class List1 
{
public static void main(String[] args)
{
 List l1= new ArrayList();	
 l1.add(0,10);
 l1.add(1,20);
 l1.add(2,30);
 l1.add(1,44);
 for(int i=0;i<l1.size();i++)
 System.out.println(l1.get(i));
 System.out.println("------remove from index 1------");
 l1.remove(1);
 System.out.println(l1);
 System.out.println("indexof20 "+l1.indexOf(20));
 System.out.println("lastindexof30 "+l1.lastIndexOf(30));
 System.out.println("----------------------");
 List l2= new ArrayList();	
 l2.add(0,59);
 l2.add(1,72);
 l2.add(2,29);
 l2.set(1,100);
 System.out.println("l1 "+l1);
 System.out.println("l2 "+l2);
 System.out.println("------l2 addall l1------");
 l2.addAll(l1);
 System.out.println(l2);
 
 List l3= new ArrayList();	
 l3.add(0,100);
 l3.add(1,200);
 l3.add(2,300);
 System.out.println("------sublist------");
 System.out.println(l3.subList(0,2));
 
}
}
