package com.cpg.map.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class LinkedHah1 {
public static void main(String[] args) {
	LinkedHashMap<String,Integer> l1=new LinkedHashMap<String,Integer>();
	l1.put("rajajinagar", 560001);
	l1.put("btm", 560031);
	l1.put("btr", 560045);
	l1.put(null, null);
	l1.put("hebbal", null);
	
	Set<Map.Entry<String,Integer>> s1=l1.entrySet();
	for(Map.Entry<String,Integer> e1:s1)
{
	System.out.println(e1.getKey());
	System.out.println(e1.getValue());
	System.out.println("-------------");
}
}
}
