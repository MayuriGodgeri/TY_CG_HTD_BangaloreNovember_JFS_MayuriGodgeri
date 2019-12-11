import java.util.HashSet;


public class HashSet1
{
public static void main(String[] args)
{
  HashSet<Integer> hs1 = new HashSet<Integer>();
  hs1.add(23);
  hs1.add(86);
  hs1.add(12);
  hs1.add(44);
  hs1.add(null);
for(Integer i1:hs1) {
	System.out.println(i1);
}

HashSet<String> hs2 = new HashSet<String>();
hs2.add("mayu");
hs2.add("suchi");
hs2.add("pankaj");
hs2.add("nisha");
hs2.add(null);
for(String i2:hs2) {
	System.out.println(i2);
}
}
}
