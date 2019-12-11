import java.util.HashSet;

public class CustHashSet 
{
public static void main(String[] args) {
	
	HashSet<CustomStud> h1=new HashSet<CustomStud>();
	h1.add(new CustomStud(22,"mayu"));
	h1.add(new CustomStud(23,"suchi"));
	h1.add(new CustomStud(20,"nisha"));
	h1.add(new CustomStud(22,"mayu"));
	
	for(CustomStud c:h1) {
	System.out.println("studName " +c.studName + "studAGE "+c.studName);
	}
}
}
