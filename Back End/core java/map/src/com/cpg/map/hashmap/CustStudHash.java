package com.cpg.map.hashmap;

import java.util.Collection;
import java.util.HashMap;

public class CustStudHash {
public static void main(String[] args) {
HashMap<Integer,Student> h1=new HashMap<Integer,Student>();	
h1.put(22,new Student(22,"mayu"));
h1.put(44,new Student(23,"suchi"));
h1.put(77,new Student(20,"nisha"));
h1.put(null,null);
h1.put(null,new Student(23,"suchi"));


Collection<Student> c1=h1.values();
for(Student s1:c1)
{
	System.out.println(s1);
}

System.out.println(h1.containsKey(44));
System.out.println(h1.containsValue(new Student(22,"mayu")));
System.out.println(h1.size());
System.out.println(h1.isEmpty());
}
}
