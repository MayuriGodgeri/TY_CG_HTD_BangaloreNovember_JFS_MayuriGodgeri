package com.cpg.map.treemap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CustStud {
public static void main(String[] args) {
	SortingAge a1=new SortingAge();
	TreeMap<Student,String> t1=new TreeMap<Student,String>(a1);
	t1.put(new Student(33,"MAYU"),"1st standard" );
	t1.put(new Student(22,"suchi"),"2nd standard" );
	t1.put(new Student(4,"mayu"),"8th standard") ;
	 
	Set<Map.Entry<Student,String>> s1 =t1.entrySet();
    for(Map.Entry<Student,String> m1:s1)
    {
  	 System.out.println(m1.getValue());
  	 System.out.println(m1.getKey());
  	 System.out.println("---------");
    }
    System.out.println(t1.get(new Student(4,"mayu")));
}
}
