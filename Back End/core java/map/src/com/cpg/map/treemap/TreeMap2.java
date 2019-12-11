package com.cpg.map.treemap;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMap2 {
public static void main(String[] args) {
	
	ArrayList<Student1> l1=new ArrayList<Student1>();
	l1.add(new Student1(22,"mayu"));
	l1.add(new Student1(23,"suchi"));
	
	ArrayList<Student1> l2=new ArrayList<Student1>();
	l2.add(new Student1(23,"kiru"));
	l2.add(new Student1(22,"mayu"));
	
	ArrayList<Student1> l3=new ArrayList<Student1>();
	l3.add(new Student1(44,"ponka"));
	l3.add(new Student1(77,"nisha"));
	
	TreeMap<String,ArrayList<Student1>> t1=new TreeMap<String,ArrayList<Student1>>();
	t1.put("1st std",l1);
	t1.put("4th std",l2);
	t1.put("2nd std",l3);
	
	Set<Map.Entry<String,ArrayList<Student1>>> s1 =t1.entrySet();
    for(Map.Entry<String,ArrayList<Student1>> m1:s1)
    {
  	 System.out.println(m1.getValue());
  	 System.out.println(m1.getKey());
  	 System.out.println("---------");
    }
	
}
}
