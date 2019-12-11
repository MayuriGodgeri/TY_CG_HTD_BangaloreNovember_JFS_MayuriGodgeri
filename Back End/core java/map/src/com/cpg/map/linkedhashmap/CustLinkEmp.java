package com.cpg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class CustLinkEmp {
public static void main(String[] args) {
	LinkedHashMap<Integer,Employee> l1=new LinkedHashMap<Integer,Employee>();
	l1.put(34, new Employee(25000, "mayu"));
	l1.put(35, new Employee(25000, "suchi"));
	l1.put(30, new Employee(25000, "nisha"));
	
	System.out.println(l1.get(35));
	Set<Map.Entry<Integer,Employee>> s1=l1.entrySet();
	for(Map.Entry<Integer,Employee> e1:s1)
{
	System.out.println(e1.getKey());
	System.out.println(e1.getValue());
	System.out.println("-------------");
	
}
	System.out.println(l1.containsKey(34));
	System.out.println(l1.containsValue(new Employee(25000, "suchi")));
	
}
}
